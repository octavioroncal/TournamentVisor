package swingtournamentvisor;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import swingtournamentvisor.controller.*;
import swingtournamentvisor.model.TournamentDataView;
import swingtournamentvisor.view.DesktopRenderer;

public class VisorServer {

    public static final String SEPARATOR = System.getProperties().getProperty("file.separator");
    public static final String ID_URL = System.getProperties().getProperty("user.dir") + SEPARATOR + "lib" + SEPARATOR + "ID";
    FileReader fr = new FileReader (ID_URL);
    String raspiID;
    DesktopRenderer desktop = null;
    TournamentActionsFactory actionsFactory;
    HttpServer httpServer;
    InetSocketAddress address;
    HttpHandler handler;
    final int port = 8080;

    public VisorServer(DesktopRenderer desktop, final TournamentActionsFactory actionsFactory) throws IOException {
        this.desktop = desktop;
        this.actionsFactory = actionsFactory;
        address = new InetSocketAddress(port);
        httpServer = HttpServer.create(address, 0);
        raspiID = new BufferedReader(fr).readLine();
        fr.close();
        handler = new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                String method = exchange.getRequestMethod();
                URI uri = exchange.getRequestURI();
                if ("GET".equals(method)) {
                    processGETRequest(uri);
                } else {
                    processPOSTRequest(exchange.getRequestURI(), exchange.getRequestBody());
                }
                byte[] response = (raspiID + ";"
                        + actionsFactory.getTournamentData().getOwnerID() + ";"
                        + actionsFactory.getTournamentData().getOwner()).getBytes();
                exchange.sendResponseHeaders(HttpURLConnection.HTTP_OK, response.length);
                exchange.getResponseBody().write(response);
                exchange.close();
            }
        };
    }

    public void start() {
        httpServer.createContext("/TournamentVisor", handler);
        httpServer.start();
    }

    public void stop() {
        httpServer.stop(0);
    }

    private Action getAction(String operation) {
        return actionsFactory.getAction(operation);
    }

    protected synchronized void processGETRequest(URI request) {
        String[] parameters;
        String op;
        String query = request.getQuery().replace('&', ' ');
        if (request.getQuery().indexOf(";") != -1) {
            op = query.substring(3, query.indexOf(";"));
        } else {
            op = query.substring(query.indexOf("=") + 1);
        }
        System.out.println(op);
        parameters = query.substring(request.getQuery().indexOf(";") + 1).split(";");
        getAction(op).executeAction(parameters, desktop, actionsFactory.getTournamentData());
    }

    protected synchronized void processPOSTRequest(URI uri, final InputStream request) throws FileNotFoundException, IOException {
        final String REFRESH_DATA_VIEW = "REFRESH_DATA_VIEW";
        String query = uri.getQuery().replace('&', ' ');
        String op = query.substring(3, query.indexOf(";"));
        System.out.println(op);
        if (op.equals(REFRESH_DATA_VIEW)) {
            try {
                JAXBContext context = JAXBContext.newInstance(TournamentDataView.class);
                Unmarshaller unmarshaller = context.createUnmarshaller();
                TournamentDataView tdv = (TournamentDataView) unmarshaller.unmarshal(request);
                RefreshTournamentData action = new RefreshTournamentData();
                action.setNewData(tdv);
                action.executeAction(new String[1], desktop, actionsFactory.getTournamentData());
            } catch (JAXBException ex) {
                System.out.println("Error");
                Logger.getLogger(VisorServer.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
