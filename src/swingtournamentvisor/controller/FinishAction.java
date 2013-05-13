package swingtournamentvisor.controller;

import javax.swing.SwingUtilities;
import swingtournamentvisor.model.TournamentDataView;
import swingtournamentvisor.view.DesktopRenderer;

public class FinishAction implements Action {

    @Override
    public boolean executeAction(String[] parameters, final DesktopRenderer renderer, final TournamentDataView tournamentDataView) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                tournamentDataView.stopTime();
                renderer.setFinishView();
            }
        });
        return true;
    }
}
