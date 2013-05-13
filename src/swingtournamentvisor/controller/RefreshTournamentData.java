package swingtournamentvisor.controller;

import javax.swing.SwingUtilities;
import swingtournamentvisor.model.TournamentDataView;
import swingtournamentvisor.view.DesktopRenderer;

public class RefreshTournamentData implements Action {

    TournamentDataView tdv;
    
    public void setNewData(TournamentDataView tdv) {
        this.tdv = tdv;
    }

    @Override
    public boolean executeAction(String[] parameters, final DesktopRenderer renderer, final TournamentDataView tournamentDataView) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() { 
                tournamentDataView.setTournamentName(tdv.getTournamentName());
                tournamentDataView.setTournamentSubName(tdv.getTournamentSubName());
                tournamentDataView.setRebuyTournament(tdv.isRebuyTournament());
                tournamentDataView.setAddonTournament(tdv.isAddonTournament());
                tournamentDataView.setSoundAlert1(tdv.getSoundAlert1());
                tournamentDataView.setSoundAlert2(tdv.getSoundAlert2());
                tournamentDataView.setSoundAllow(tdv.isSoundAllow());
                tournamentDataView.setBlindStruct(tdv.getBlindStruct());
                tournamentDataView.setPrizeStruct(tdv.getPrizeStruct());
                tournamentDataView.setLevelInProgress(tdv.getActualLevel());
                tournamentDataView.setLivePlayers(tdv.getLivePlayers());
                tournamentDataView.setBuyins(tdv.getBuyins());
                tournamentDataView.setReentries(tdv.getReentries());
                tournamentDataView.setRebuys(tdv.getRebuys());
                tournamentDataView.setChipsAverage(tdv.getChipsAverage());
                tournamentDataView.setAddOns(tdv.getAddOns());
                tournamentDataView.setAnnouncementList(tdv.getAnnouncementList());
                tournamentDataView.setTournamentState(tdv.getTournamentState());
                renderer.setVisible();
                renderer.refreshData();
            }
        });
        return true;
    }

  
}
