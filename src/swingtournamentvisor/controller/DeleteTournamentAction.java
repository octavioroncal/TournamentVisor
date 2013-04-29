package swingtournamentvisor.controller;

import javax.swing.SwingUtilities;
import swingtournamentvisor.model.TournamentDataView;
import swingtournamentvisor.view.DesktopRenderer;

public class DeleteTournamentAction implements Action {

    @Override
    public boolean executeAction(String[] parameters, final DesktopRenderer renderer, final TournamentDataView tournamentDataView) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                tournamentDataView.reset();
                renderer.closeViewer();
                tournamentDataView.deleteTournament();
            }
        });
        return true;
    }
}
