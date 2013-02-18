package swingtournamentvisor.controller;

import javax.swing.SwingUtilities;
import swingtournamentvisor.model.TournamentDataView;
import swingtournamentvisor.view.DesktopRenderer;

public class SetLevelAction implements Action {

    @Override
    public boolean executeAction(String[] parameters, final DesktopRenderer renderer, final TournamentDataView tournamentDataView) {
        final int level = Integer.parseInt(parameters[0].substring(parameters[0].indexOf("=") + 1));
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                tournamentDataView.setLevelInProgress(level);
                renderer.refreshData();
            }
        });
        return true;
    }
}
