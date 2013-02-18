package swingtournamentvisor.controller;

import swingtournamentvisor.model.TournamentDataView;
import swingtournamentvisor.view.DesktopRenderer;

public class UnknownAction implements Action {

    @Override
    public boolean executeAction(String[] parameters, DesktopRenderer renderer, TournamentDataView tournamentDataView) {
        throw new UnsupportedOperationException("Not supported action.");
    }

}
