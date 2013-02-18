package swingtournamentvisor.controller;

import swingtournamentvisor.model.TournamentDataView;
import swingtournamentvisor.view.DesktopRenderer;

public class PollAction implements Action {

    @Override
    public boolean executeAction(String[] parameters, DesktopRenderer desktop, TournamentDataView tournamentDataView) {
        return true;   
    }
}
