package swingtournamentvisor.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TenerifePrizeStruct  extends PrizeStruct { 

    public TenerifePrizeStruct() {
        super();
        name = "Casinos de Tenerife";
        percentagesList.add(new PrizePosition(1,0.0,100.0,0));
        percentagesList.add(new PrizePosition(2,0.0,60.0,0));
        percentagesList.add(new PrizePosition(3,0.0,45.0,0));
        percentagesList.add(new PrizePosition(4,0.0,33.75,0));
        percentagesList.add(new PrizePosition(5,0.0,25.3125,0));
        percentagesList.add(new PrizePosition(6,0.0,18.9844,0));
        percentagesList.add(new PrizePosition(7,0.0,14.2383,0));
        percentagesList.add(new PrizePosition(8,0.0,10.6787,0));
        percentagesList.add(new PrizePosition(9,0.0,8.0090,0));
        percentagesList.add(new PrizePosition(10,0.0,6.0068,0));
        percentagesList.add(new PrizePosition(11,0.0,6.0068,0));
        percentagesList.add(new PrizePosition(12,0.0,6.0068,0));
    }
    
    @Override
    public void calculatePlayersWhoReceive(int registredPlayers, int reentries) {
        playersWhoRecieve = (registredPlayers + 2)/10 +2;
    }

}
