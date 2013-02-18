package swingtournamentvisor.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Level implements Cloneable {

    private Integer level;
    private Integer time;
    private Integer ante;
    private Integer bigBlind;
    private Integer smallBlind;
    private String breather;

    public Level(int level, int time, int smallBlind, int ante, int bigBlind, String breather) {
        this.time = time;
        this.ante = ante;
        this.bigBlind = bigBlind;
        this.smallBlind = smallBlind;
        this.level = level;
        this.breather = breather;
    }

    public Level() {
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;

    }

    public int getAnte() {
        return ante;
    }

    public void setAnte(int ante) {
        this.ante = ante;
    }

    public int getBigBlind() {
        return bigBlind;
    }

    public void setBigBlind(int bigBlind) {
        this.bigBlind = bigBlind;
    }

    public int getSmallBlind() {
        return smallBlind;
    }

    public void setSmallBlind(int smallBlind) {
        this.smallBlind = smallBlind;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getBreather() {
        return breather;
    }

    public void setBreather(String breather) {
        this.breather = breather;
    }

    @Override
    protected Level clone() throws CloneNotSupportedException {
        return (Level) super.clone();
    }

    public Integer levelProperty() {
        return level;
    }

    public Integer timeProperty() {
        return time;
    }

    public Integer anteProperty() {
        return ante;
    }

    public Integer bigBlindProperty() {
        return bigBlind;
    }

    public Integer smallBlindProperty() {
        return smallBlind;
    }

    public String breatherProperty() {
        return breather;
    }

    public void setAll(int level, int time, int smallBlind, int ante, int bigBlind, String breather) {
        this.time = time;
        this.ante = ante;
        this.bigBlind = bigBlind;
        this.smallBlind = smallBlind;
        this.level = level;
        this.breather = breather;

    }

    @Override
    public String toString() {
        return "Level{" + "level=" + level + ", time=" + time + ", ante=" + ante + ", bigBlind=" + bigBlind + ", smallBlind=" + smallBlind + '}';
    }
}
