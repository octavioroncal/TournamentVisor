package swingtournamentvisor.controller;

import swingtournamentvisor.model.TournamentDataView;
import swingtournamentvisor.view.DesktopRenderer;

public class LockVisorAction implements Action {

    @Override
    public boolean executeAction(String[] parameters, DesktopRenderer renderer, TournamentDataView tournamentDataView) {
        final long owner = Long.parseLong(parameters[0].substring(parameters[0].indexOf("=") + 1));
        tournamentDataView.setOwnerID(owner);
        tournamentDataView.setTournamentName(parameters[1].substring(parameters[1].indexOf("=") + 1));
        tournamentDataView.setOwner(parameters[1].substring(parameters[1].indexOf("=") + 1));
        tournamentDataView.lock();
        return true;
    }

}
