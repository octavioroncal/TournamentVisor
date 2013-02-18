package swingtournamentvisor.controller;

import javax.swing.SwingUtilities;
import swingtournamentvisor.model.TournamentDataView;
import swingtournamentvisor.view.DesktopRenderer;

public class ShowHideAction implements Action {

    @Override
    public boolean executeAction(String[] parameters, final DesktopRenderer renderer, TournamentDataView tournamentDataView) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                /*if (desktop.getPrimePane().isVisible()) {
                    desktop.getPrimePane().setVisible(false);
                } else {
                    desktop.getPrimePane().setVisible(true);
                }*/
            }
        });
        return true;
    }

}
