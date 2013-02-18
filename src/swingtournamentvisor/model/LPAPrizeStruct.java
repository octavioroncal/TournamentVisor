package swingtournamentvisor.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LPAPrizeStruct extends PrizeStruct {

    public LPAPrizeStruct() {
        super();
        name = "Casino de Las Palmas";
        percentagesList.add(new PrizePosition(1,0.0,100.0,0));
        percentagesList.add(new PrizePosition(2,0.0,60.0,0));
        percentagesList.add(new PrizePosition(3,0.0,40.0,0));
        percentagesList.add(new PrizePosition(4,0.0,30.0,0));
        percentagesList.add(new PrizePosition(5,0.0,22.5,0));
        percentagesList.add(new PrizePosition(6,0.0,16.875,0));
        
    }

    @Override
    public void calculatePlayersWhoReceive(int registredPlayers, int reentries) {
        if (registredPlayers < 3) {
            playersWhoRecieve = 0;
        } else {
            if (registredPlayers < 30) {
                playersWhoRecieve = 3;
            } else {
                if (registredPlayers < 46) {
                    playersWhoRecieve = 4;
                } else {
                    if (registredPlayers < 60) {
                        playersWhoRecieve = 5;
                    } else {
                        playersWhoRecieve = 6;
                    }
                }
            }
        }
    }
}
