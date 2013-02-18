package swingtournamentvisor.controller;

import swingtournamentvisor.model.TournamentDataView;
import swingtournamentvisor.view.DesktopRenderer;

public interface Action {
    public boolean executeAction(String[] parameters, final DesktopRenderer renderer, final TournamentDataView tournamentDataView);
}
