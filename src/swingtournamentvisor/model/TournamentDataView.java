package swingtournamentvisor.model;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import swingtournamentvisor.view.AlertSound;

@XmlRootElement
@XmlSeeAlso({Announcement.class, Level.class, PrizeStruct.class, BlindStruct.class})
public final class TournamentDataView {
    private boolean locked = false;
    private long ownerID = 0;
    private String owner = "Free";
    private Integer chipsAverage = 0;
    private Integer buyins = 0;
    private Integer livePlayers = 0;
    private Integer reentries = 0;
    private Integer addOns = 0;
    private Integer rebuys = 0;
    private Integer timeToBreak = 0;
    private Integer soundAlert1 = 0;
    private Integer soundAlert2 = 0;
    private Integer transcurredTime = 0;
    private String tournamentName = "";
    private String tournamentSubName = "";
    private String breakLabel = "";
    private boolean breakLabelVisible = false;
    private String nextBlinds = "";
    private boolean blindsPane = true;
    private boolean lastTime = false;
    private boolean rebuyTournament = false;
    private boolean addonTournament = false;
    private boolean finalizedTournament = false;
    private boolean soundAllow = false;
    private BlindStruct blindStruct;
    private PrizeStruct prizeStruct;
    private final Level levelInProgress = new Level(0, 0, 0, 0, 0, "0");
    private LevelTimeService levelTimeService = new LevelTimeService();
    private LevelTimeListener timeListener;
    private Level nextLevel = new Level();
    private ArrayList<Announcement> announcementList = new ArrayList<>();
    public enum stateType {PLAYING, PAUSED, BREAK, BREAK_PAUSED, INFINITE_BREAK, STOPPED, ED_BREAK, CR_BREAK, DB_BREAK};
    private stateType tournamentState = stateType.STOPPED;
    private ArrayList<DataChangedListener> dataChangedlistenerList = new ArrayList<>();

    public TournamentDataView() {
        timeListener = new LevelTimeListener() {
            @Override
            public void timeChanged(final Integer t1) {
                if (t1 == 0) {
                    if (tournamentState == stateType.PLAYING) {
                        new AlertSound("temple.wav").start();
                        if (!"0".equals(getLevelInProgress().getBreather())) { //Break
                            setBreakTime(getLevelInProgress().getBreather());
                        } else { // No Break
                            levelUp();
                        }
                    } else {
                        setPlayingState();
                        levelUp();
                    }
                    for (DataChangedListener listener : dataChangedlistenerList) {
                        listener.dataChanged();
                    }
                } else {
                    updateTranscurredTime();
                    updateTimeToBreak();
                    if (soundAlert1 != 0 && (t1 == soundAlert1 * 60) && isSoundAllow()) {
                        System.out.println("dingg 1");
                        new AlertSound("ding.wav").start();
                    }
                    if (soundAlert2 != 0 && (t1 == soundAlert2 * 60) && isSoundAllow()) {
                        System.out.println("dingg 2");
                        new AlertSound("ding.wav").start();
                    }
                    if (soundAlert2 < soundAlert1) {
                        if (t1 <= soundAlert2 && soundAlert2 != 0) {
                            lastTime = true;
                        } else {
                            lastTime = false;
                        }
                    } else {
                        if (t1 <= soundAlert1 && soundAlert1 != 0) {
                            lastTime = true;
                        } else {
                            lastTime = false;
                        }
                    }
                }
            }
        };
        levelTimeService.addTimeListener(timeListener);
    }
    private void setBreakTime(String breakCode) {
        int breakTime;
        try {
            breakTime = Integer.parseInt(breakCode);
            setNormalBreak(breakTime);
        } catch (NumberFormatException ex) {
            breakTime = Integer.parseInt(getLevelInProgress().getBreather().substring(2));
            if (breakCode.contains("ED")) {
                setEndOfDayBreak();
                getLevelTimeService().stop();
                levelUp();
            } else {
                if (breakCode.contains("DB")) {
                    setDinnerBreak();
                } else {
                    if (breakCode.contains("CR")) {
                        setChipRaceBreak();
                    }
                }
                getLevelTimeService().setLevelTime(breakTime * 60);
            }
        }
        blindsPane = false;
        breakLabelVisible = true;
    }

    public void addDataListener(DataChangedListener dataListener) {
        dataChangedlistenerList.add(dataListener);
    }
    public int updateTranscurredTime() {// contar si en descanso actualmente
        int timeVar = 0;
        if (blindStruct != null) {
            for (Level l : blindStruct.getLevelList()) {
                if (l.getLevel() < getActualLevel()) {
                    timeVar += l.getTime();
                    if (!"0".equals(l.getBreather())) {
                        try {
                            timeVar += Integer.parseInt(l.getBreather());
                        } catch (NumberFormatException ex) {
                            timeVar += Integer.parseInt(l.getBreather().substring(2));
                        }
                    }
                } else {
                    break;
                }
            }
            int breakIn;
            if (tournamentState.toString().contains("BREAK")) {
                try {
                    breakIn = Integer.parseInt(levelInProgress.getBreather());
                } catch (NumberFormatException ex) {
                    breakIn = Integer.parseInt(levelInProgress.getBreather().substring(2));
                }
                timeVar += levelInProgress.getTime() + breakIn - levelTimeService.getLevelTime() / 60;
            } else {
                timeVar += levelInProgress.getTime() - levelTimeService.getLevelTime() / 60;
            }
            transcurredTime = timeVar;
        }
        return timeVar;
    }

    private void levelUp() {
        if (!isLastLevel()) {
            setLevelInProgress(levelInProgress.getLevel() + 1);
        } else {
            finalizeTournament();
        }
    }

    private void finalizeTournament() {
        getLevelTimeService().stop();
        tournamentState = stateType.STOPPED;
        for (DataChangedListener listener : dataChangedlistenerList) {
            listener.dataChanged();
        }
    }

    public int updateTimeToBreak() {
        int timeVar = 0;
        if (blindStruct != null) {
            if ("0".equals(levelInProgress.getBreather())) {
                for (int i = levelInProgress.getLevel(); i < blindStruct.getLevelList().size() - 1; i++) {
                    if (!"0".equals(blindStruct.get(i - 1).getBreather())) {
                        break;
                    } else {
                        timeVar += blindStruct.get(i).getTime();
                    }
                }
            }
            timeVar += levelTimeService.getLevelTime() / 60;
            timeToBreak = timeVar;
        }
        return timeVar;
    }

    public void reset() {
        setOwner("Free");
        setOwnerID(0);
        unlock();
        levelTimeService.setLevelTime(0);
        announcementList.clear();
        prizeStruct = null;
        blindStruct = null;
        tournamentState = stateType.STOPPED;
        timeToBreak = 0;
        transcurredTime = 0;
        chipsAverage = 0;
        buyins = 0;
        livePlayers = 0;
        reentries = 0;
        addOns = 0;
        rebuys = 0;
        breakLabel = "";
        tournamentName = "";
        tournamentSubName = "";
        breakLabelVisible = false;
        nextBlinds = "";
        blindsPane = true;
        lastTime = false;
        rebuyTournament = false;
        addonTournament = false;
        soundAllow = false;
        levelInProgress.setAll(0, 0, 0, 0, 0, "0");
        nextLevel = new Level();
    }

    private void setChipRaceBreak() {
        tournamentState = stateType.CR_BREAK;
        breakLabel = "CHIP RACE";
    }

    private void setDinnerBreak() {
        tournamentState = stateType.DB_BREAK;
        breakLabel = "DINNER BREAK";
    }

    private void setEndOfDayBreak() {
        tournamentState = stateType.ED_BREAK;
        breakLabel = "END OF DAY";
    }

    private void setPlayingState() {
        tournamentState = stateType.PLAYING;
        breakLabel = "";
    }

    private void setNormalBreak(int breakTime) {
        tournamentState = stateType.BREAK;
        breakLabel = "BREAK";
        getLevelTimeService().setLevelTime(breakTime * 60);
    }

    public void pause() {
        getLevelTimeService().stop();
        tournamentState = stateType.PAUSED;
    }

    public void lock(){
        locked = true;
    }
    
    public void unlock(){
        locked = false;
        levelTimeService.stop();
    }

    public boolean isLocked() {
        return locked;
    }

    public long getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(long ownerID) {
        this.ownerID = ownerID;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    public void play() {
        tournamentState = stateType.PLAYING;
        getLevelTimeService().start();
    }

    public boolean isLastLevel() {
        Level l = getBlindStruct().getLastLevel();
        if (l.getLevel() == getLevelInProgress().getLevel()) {
            return true;
        }
        return false;
    }

    public void setLevel(final int level) {
        setLevelInProgress(level);
    }

    public void setChipsAverage(int chipsAverage) {
        this.chipsAverage = chipsAverage;
    }

    public void setBuyins(int buyins) {
        this.buyins = buyins;
    }

    public void setReentries(int reentries) {
        this.reentries = reentries;
    }

    public void setAddOns(int addOns) {
        this.addOns = addOns;
    }

    public void setRebuys(int rebuys) {
        this.rebuys = rebuys;
    }
    
    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public void setTournamentSubName(String tournamentSubName) {
        this.tournamentSubName = tournamentSubName;
    }

    public void setBlindStruct(BlindStruct blindStruct) {
        this.blindStruct = blindStruct;
    }

    public void setPrizeStruct(PrizeStruct prizeStruct) {
        this.prizeStruct = prizeStruct;
    }

    public void setTimeToBreak(int timeToBreak) {
        this.timeToBreak = timeToBreak;
    }

    public void setTranscurredTime(int transcurredTime) {
        this.transcurredTime = transcurredTime;
    }

    public void setBreakLabel(String breakType) {
        this.breakLabel = breakType;
    }

    public void setLivePlayers(int players) {
        this.livePlayers = players;
    }

    public void setAnnouncementList(ArrayList<Announcement> announcementList) {
        synchronized (this.announcementList) {
            this.announcementList = announcementList;
        }
    }

    public void setRebuyTournament(boolean rebuyTournament) {
        this.rebuyTournament = rebuyTournament;
    }

    public void setAddonTournament(boolean addonTournament) {
        this.addonTournament = addonTournament;
    }

    public void setLevelInProgress(final int level) {
        if (level != levelInProgress.getLevel()) {
            Level l = blindStruct.get(level - 1);
            levelInProgress.setAll(l.getLevel(), l.getTime(),
                    l.getSmallBlind(), l.getAnte(), l.getBigBlind(), l.getBreather());
            if (!isLastLevel()) {
                setNextLevel(blindStruct.nextLevel(levelInProgress));
            } else {
                nextLevel = null;
                nextBlinds = "";
            }
            levelTimeService.setLevelTime(levelInProgress.getTime() * 60);
            setPlayingState();
        }
        updateTimeToBreak();
        updateTranscurredTime();
    }

    public void setNextLevel(Level nextLevel) {
        this.nextLevel = nextLevel;
        nextBlinds = nextLevel.getSmallBlind() + " / " + nextLevel.getBigBlind() + "  (" + nextLevel.getAnte() + ")";
    }

    public void setSoundAlert1(int soundAlert1) {
        this.soundAlert1 = soundAlert1;
    }

    public void setSoundAlert2(int soundAlert2) {
        this.soundAlert2 = soundAlert2;
    }

    public void setSoundAllow(boolean soundAllow) {
        this.soundAllow = soundAllow;
    }

    public Integer getSmallBlind() {
        return levelInProgress.smallBlindProperty();
    }

    public Integer getAnteBlind() {
        return levelInProgress.anteProperty();
    }

    public Integer getBigBlind() {
        return levelInProgress.bigBlindProperty();
    }

    public Integer chipsAverageProperty() {
        return chipsAverage;
    }

    public Integer buyinsProperty() {
        return buyins;
    }

    public Integer reentriesProperty() {
        return reentries;
    }

    public Integer addOnsProperty() {
        return addOns;
    }

    public Integer rebuysProperty() {
        return rebuys;
    }

    public boolean blindsPaneProperty() {
        return blindsPane;
    }

    public Integer getNextSmallBlind() {
        return nextLevel.smallBlindProperty();
    }

    public Integer getNextBigBlind() {
        return nextLevel.bigBlindProperty();
    }

    public Integer getNextAnteBlind() {
        return nextLevel.anteProperty();
    }

    public synchronized Integer getTimeToBreak() {
        return timeToBreak;
    }

    public synchronized Integer getTranscurredTime() {
        return transcurredTime;
    }

    public String nextBlindsProperty() {
        return nextBlinds;
    }

    public String tournamentNameProperty() {
        return tournamentName;
    }

    public String tournamentSubNameProperty() {
        return tournamentSubName;
    }

    public boolean lastTimeProperty() {
        return lastTime;
    }

    public Integer levelProperty() {
        return levelInProgress.levelProperty();
    }

    public int getActualLevel() {
        return levelInProgress.getLevel();
    }

    public Integer livePlayersProperty() {
        return livePlayers;
    }

    public String breakLabelProperty() {
        return breakLabel;
    }

    public boolean breakLabelVisibleProperty() {
        return breakLabelVisible;
    }

    public String getBreakLabel() {
        return breakLabel;
    }

    @XmlElement
    public String getTournamentName() {
        return tournamentName;
    }

    @XmlElement
    public String getTournamentSubName() {
        return tournamentSubName;
    }

    @XmlElement
    public int getLivePlayers() {
        return livePlayers;
    }

    @XmlElement
    public boolean isRebuyTournament() {
        return rebuyTournament;
    }

    @XmlElement
    public boolean isAddonTournament() {
        return addonTournament;
    }
    
    public Level getLevelInProgress() {
        return levelInProgress;
    }
    
    @XmlElement
    public int getLevel(){
        return levelInProgress.getLevel();
    }

    @XmlElement
    public synchronized ArrayList<Announcement> getAnnouncementList() {
        return announcementList;
    }

    @XmlElement
    public BlindStruct getBlindStruct() {
        return blindStruct;
    }

    @XmlElement
    public PrizeStruct getPrizeStruct() {
        return prizeStruct;
    }

    @XmlElement
    public int getChipsAverage() {
        return chipsAverage;
    }

    @XmlElement
    public int getBuyins() {
        return buyins;
    }

    @XmlElement
    public int getReentries() {
        return reentries;
    }

    @XmlElement
    public int getAddOns() {
        return addOns;
    }

    @XmlElement
    public int getRebuys() {
        return rebuys;
    }

    @XmlElement
    public boolean isSoundAllow() {
        return soundAllow;
    }

    @XmlElement
    public int getSoundAlert1() {
        return soundAlert1;
    }

    @XmlElement
    public int getSoundAlert2() {
        return soundAlert2;
    }

    @XmlElement
    public stateType getTournamentState() {
        return tournamentState;
    }

    @XmlElement
    public boolean isFinalizedTournament() {
        return finalizedTournament;
    }

    public void setFinalizedTournament(boolean finalizedTournament) {
        this.finalizedTournament = finalizedTournament;
    }

    public void setTournamentState(stateType tournamentState) {
        this.tournamentState = tournamentState;
    }

    public void deleteTournament() {
    }

    public Level getNextLevel() {
        return nextLevel;
    }

    public LevelTimeService getLevelTimeService() {
        return levelTimeService;
    }

    public void stopTime() {
        levelTimeService.stop();
    }
}
