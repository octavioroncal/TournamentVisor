package swingtournamentvisor;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import swingtournamentvisor.controller.TournamentActionsFactory;
import swingtournamentvisor.view.Desktop1080;
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
            JFrame desktop;
            Toolkit tk = Toolkit.getDefaultToolkit();
            Dimension size = tk.getScreenSize();
            desktop = new Desktop720();
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
