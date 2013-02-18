package swingtournamentvisor.model;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.NONE)
@XmlType
@XmlSeeAlso({PrizePosition.class, CPTPrizeStruct.class, OACPrizeStruct.class, 
    LPAPrizeStruct.class, TenerifePrizeStruct.class, SatelitePrizeStruct.class, CustomPrizeStruct.class})
public abstract class PrizeStruct {

    protected ArrayList<PrizePosition> percentagesList = new ArrayList<>();
    protected int registredPlayers = 0;
    protected int reentries = 0;
    protected int handout = 0;
    protected int playersWhoRecieve = 1;
    protected String name;

    public PrizeStruct() {
    }

    @XmlAttribute
    public int getPlayersWhoRecieve() {
        return playersWhoRecieve;
    }

    public void setPlayersWhoRecieve(int playersWhoRecieve) {
        this.playersWhoRecieve = playersWhoRecieve;
    }

    @XmlAttribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlAttribute
    public int getRegistredPlayers() {
        return registredPlayers;
    }

    public void setRegistredPlayers(int registredPlayers) {
        this.registredPlayers = registredPlayers;

    }

    @XmlAttribute
    public int getReentries() {
        return reentries;
    }

    public void setReentries(int reentries) {
        this.reentries = reentries;

    }

    @XmlAttribute
    public int getHandout() {
        return handout;
    }

    public void setHandout(int handout) {
        this.handout = handout;

    }

    @XmlElement
    public ArrayList<PrizePosition> getPercentagesList() {
        return percentagesList;
    }

    public void setPercentagesList(ArrayList<PrizePosition> percentagesList) {
        this.percentagesList = percentagesList;
    }

    public void calculatePlayersWhoReceive(int registredPlayers, int reentries) {
        int numPlayers = 0;
        if ((registredPlayers + reentries) > 17) {
            if ((registredPlayers + reentries) <= 107) {
                numPlayers = ((registredPlayers + reentries) / 10) + 2;
            } else if ((registredPlayers + reentries) <= 250) {
                numPlayers = ((registredPlayers + reentries) / 9) + 1;
            }
            if ((numPlayers % 3) == 1) {
                numPlayers--;
            }
            if ((numPlayers % 3) == 2) {
                numPlayers++;
            }
        }
        playersWhoRecieve = numPlayers;
    }

    public void calculateAbsPercentages() {
        double denominador = 0;
        double x;
        for (int i = 0; i < playersWhoRecieve; i++) {
            denominador += percentagesList.get(i).getRelPercentage();
        }
        for (int i = 0; i < playersWhoRecieve; i++) {
            x = ((int) ((percentagesList.get(i).getRelPercentage() / denominador) * 10000)) / 100.0;
            percentagesList.get(i).setAbsPercentage(x);
        }

    }

    public void calculatePrizes() {
        calculatePlayersWhoReceive(registredPlayers, reentries);
        calculateAbsPercentages();
        double prize, prizeCheck = 0;
        int players = getPlayersWhoRecieve();
        for (int i = 0; i < players; i++) {
            prize = (handout * getPercentagesList().get(i).getAbsPercentage()) / 100.0;
            if ("Tenerife".equals(getName())) {
                prize = (int) (((prize / 10) + 5) * 10);
            } else {
                prize = (int) (((prize / 10) + 0.5) * 10);
            }
            getPercentagesList().get(i).setMoney((int) prize);
            prizeCheck += prize;
        }
        int x = getPercentagesList().get(0).getMoney();
        getPercentagesList().get(0).setMoney((int) (x - (prizeCheck - handout)));
    }
}
