package swingtournamentvisor.view;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import swingtournamentvisor.model.Announcement;
import swingtournamentvisor.model.DataChangedListener;
import swingtournamentvisor.model.LevelTimeListener;
import swingtournamentvisor.model.PrizePosition;
import swingtournamentvisor.model.TournamentDataView;

public final class DesktopRenderer {
    
    private  final TournamentDataView tournamentDataView;
    private Desktop720 desktop;
    private LevelTimeListener timeListener;
    private DataChangedListener dataListener;
    private Thread announcementThread;
    
    public DesktopRenderer(TournamentDataView dataParamenter, final JFrame desktopFrame) {
        this.tournamentDataView = dataParamenter;
        this.desktop = (Desktop720) desktopFrame;
        setTimeListener();
        dataListener = new DataChangedListener() {
            @Override
            public void dataChanged() {
                refreshData();
            }
        };
        tournamentDataView.getLevelTimeService().addTimeListener(timeListener);
        announcementThread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    for (Announcement an : tournamentDataView.getAnnouncementList()) {
                        if (an.isActive()) {
                            desktop.getAnnuncement().setText(an.getAnnouncement());
                            if (an.isHighlight())
                                desktop.getAnnouncement().setForeground(Color.red);
                            else 
                                desktop.getAnnouncement().setForeground(Color.white);
                        }
                        showPrizesList();
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            System.out.println("Thread anuncios Y PRIZES");
                        }
                    }
                }
            }
        };
        announcementThread.start();
    }
    
    
    public void setTimeListener() {
        timeListener = new LevelTimeListener() {
            @Override
            public void timeChanged(final Integer t1) {
                String sg = t1 % 60 + "";
                if (sg.length() == 1) {
                    sg = "0" + sg;
                }
                String min = t1 / 60 + "";
                if (min.length() == 1) {
                    min = "0" + min;
                }
                desktop.getTime().setText(min + ":" + sg);
                if (t1 % 60 == 0) {
                    refreshData();
                }
            }
        };
    }

    public void refreshData() {
        desktop.getTournamentName().setText(tournamentDataView.getTournamentName());
        desktop.getSubName().setText(tournamentDataView.getTournamentSubName());
        desktop.getLivePlayers().setText(tournamentDataView.getLivePlayers() + "/" + tournamentDataView.getBuyins());
        desktop.getAnte().setText(tournamentDataView.getAnteBlind().toString());
        desktop.getBb().setText(tournamentDataView.getBigBlind().toString());
        desktop.getSb().setText(tournamentDataView.getSmallBlind().toString());
        desktop.getBuyins().setText(tournamentDataView.getBuyins()+"");
        if (tournamentDataView.getPrizeStruct() != null)
            showPrizesList();
        desktop.getChipsAverage().setText(tournamentDataView.getChipsAverage() + "");
        if (tournamentDataView.isRebuyTournament()) {
            desktop.getRebuys().setText(tournamentDataView.getRebuys() + "");
            desktop.getRebuysLabel().setText("Rebuys");
        } else {
            desktop.getRebuys().setText(tournamentDataView.getReentries() + "");
            desktop.getRebuysLabel().setText("Reentries");
            
        }
        if (tournamentDataView.isAddonTournament()) {
            desktop.getAddonsLabel().setVisible(true);
            desktop.getAddons().setText(tournamentDataView.getAddOns() + "");
        } else {
            desktop.getAddonsLabel().setVisible(false);
        }
        desktop.getLevel().setText(tournamentDataView.getActualLevel() + "");
        desktop.getNextLevel().setText(tournamentDataView.getNextSmallBlind() + "/" + tournamentDataView.getNextBigBlind() + "(" + tournamentDataView.getNextAnteBlind() + ")");
        desktop.getPlayed().setText(convertToTimeFormat(tournamentDataView.updateTranscurredTime()));
        desktop.getBreakIn().setText(convertToTimeFormat(tournamentDataView.updateTimeToBreak()));
    }

    private String convertToTimeFormat(int time) {
        String min = time / 60 + "";
        String sg = time % 60 + "";
        if (sg.length() == 1) {
            sg = "0" + sg;
        }
        if (min.length() == 1) {
            min = "0" + min;
        }
        return min + ":" + sg;
    }

    public void closeViewer() {
        desktop.setVisible(false);
    }

    public void setVisible(){
        desktop.setVisible(true);
    }
    
    public void setPauseView(){
        
    }

    public void setPlayView() {
        
    }
    
    private void showPrizesList() {
        ArrayList<PrizePosition> prizesList = tournamentDataView.getPrizeStruct().getPercentagesList();
        desktop.getMoneyFirst().setText(prizesList.get(0).getMoney() + "€");
        int sizeList = prizesList.size();
/*        for (Integer i = 0; i < sizeList; i++) {
            desktop.getPosList().get(i).setText(i + 2 + " º");
        }
        for (Integer i = 0; i < sizeList; i++) {
            desktop.getMoneyList().get(i).setText(prizesList.get(i + 1).getMoney() + " €");
        }*/
    }
}
