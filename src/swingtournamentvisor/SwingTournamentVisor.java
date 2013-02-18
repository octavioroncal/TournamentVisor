package swingtournamentvisor;

import java.io.IOException;
import javax.swing.SwingUtilities;
import swingtournamentvisor.controller.TournamentActionsFactory;
import swingtournamentvisor.view.Desktop720;
import swingtournamentvisor.view.DesktopRenderer;

public class SwingTournamentVisor {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingTournamentVisor().start();
            }
        });
    }
    
    public void start() {
        try {
            Desktop720 desktop = new Desktop720();
            //desktop.setExtendedState(Frame.MAXIMIZED_BOTH);
            desktop.setVisible(false);
            TournamentActionsFactory actionsFactory = new TournamentActionsFactory();
            final DesktopRenderer renderer = new DesktopRenderer(actionsFactory.getTournamentData(), desktop);
            final VisorServer server = new VisorServer(renderer, actionsFactory);
            server.start();
        } catch (IOException ex) {
             System.out.println("Error server IO: "+ ex.getMessage());
        }
    }

}
