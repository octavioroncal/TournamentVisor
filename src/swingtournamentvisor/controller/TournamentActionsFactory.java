package swingtournamentvisor.controller;

import swingtournamentvisor.model.TournamentDataView;

public class TournamentActionsFactory extends ActionsFactory {

    private final String SET_LEVEL = "SET_LEVEL";
    private final String PLAY = "PLAY";
    private final String PAUSE = "PAUSE";
    private final String CREATE_VISOR = "CREATE_VISOR";
    private final String SHOW_HIDE_VISOR = "SHOW_HIDE_VISOR";
    private final String CLOSE_VISOR = "CLOSE_VISOR";
    private final String REFRESH_TIME = "REFRESH_TIME";
    private final String POLL = "POLL";
    private final String UNLOCK = "UNLOCK";
    private final String LOCK = "LOCK";
    private final String FINISH_TOURNAMENT = "FINISH_TOURNAMENT";

    private TournamentDataView tournamentData = new TournamentDataView();
    
    @Override
    protected Action factoryMethod(String action) {
        switch (action) {
            case SET_LEVEL:
                return new SetLevelAction();
            case PLAY:
                return new PlayAction();
            case PAUSE:
                return new PauseAction();
            case CREATE_VISOR:
                return new RefreshTournamentData();
            case SHOW_HIDE_VISOR:
                return new ShowHideAction();
            case REFRESH_TIME:
                return new RefreshTimeAction();
            case UNLOCK:
                return new DeleteTournamentAction();
            case CLOSE_VISOR:
                return new CloseVisorAction();
            case LOCK:
                return new LockVisorAction();
            case FINISH_TOURNAMENT:
                return new FinishAction();
            case POLL:
                return new PollAction();
            default:
                return new UnknownAction();
        }
    }

    public TournamentDataView getTournamentData() {
        return tournamentData;
    }
}
