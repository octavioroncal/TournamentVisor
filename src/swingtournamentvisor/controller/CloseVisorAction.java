package swingtournamentvisor.controller;

import javax.swing.SwingUtilities;
import swingtournamentvisor.model.TournamentDataView;
import swingtournamentvisor.view.DesktopRenderer;

class CloseVisorAction implements Action {

    public CloseVisorAction() {
    }

    @Override
    public boolean executeAction(String[] parameters, final DesktopRenderer desktop, final TournamentDataView tournamentDataView) {
         SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                tournamentDataView.stopTime(); 
                desktop.closeViewer();
            }
        });
        return true;
    }

}
