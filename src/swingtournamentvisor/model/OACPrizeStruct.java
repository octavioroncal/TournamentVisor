package swingtournamentvisor.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OACPrizeStruct extends PrizeStruct {

    public OACPrizeStruct() {
        super();
        name = "Casino OAC";
        percentagesList.add(new PrizePosition(1, 0.0, 100.0, 0));
        percentagesList.add(new PrizePosition(2, 0.0, 66.6667, 0));
        percentagesList.add(new PrizePosition(3, 0.0, 50.0, 0));
        percentagesList.add(new PrizePosition(4, 0.0, 33.3333, 0));
        percentagesList.add(new PrizePosition(5, 0.0, 25.0, 0));
        percentagesList.add(new PrizePosition(6, 0.0, 18.75, 0));
        percentagesList.add(new PrizePosition(7, 0.0, 12.5, 0));
        percentagesList.add(new PrizePosition(8, 0.0, 9.375, 0));
        percentagesList.add(new PrizePosition(9, 0.0, 7.0313, 0));
        percentagesList.add(new PrizePosition(10, 0.0, 4.6885, 0));
        percentagesList.add(new PrizePosition(11, 0.0, 4.6885, 0));
        percentagesList.add(new PrizePosition(12, 0.0, 4.6885, 0));
        percentagesList.add(new PrizePosition(13, 0.0, 3.5156, 0));
        percentagesList.add(new PrizePosition(14, 0.0, 3.5156, 0));
        percentagesList.add(new PrizePosition(15, 0.0, 3.5156, 0));
        percentagesList.add(new PrizePosition(16, 0.0, 2.6367, 0));
        percentagesList.add(new PrizePosition(17, 0.0, 2.6367, 0));
        percentagesList.add(new PrizePosition(18, 0.0, 2.6367, 0));
        percentagesList.add(new PrizePosition(19, 0.0, 2.1094, 0));
        percentagesList.add(new PrizePosition(20, 0.0, 2.1094, 0));
        percentagesList.add(new PrizePosition(21, 0.0, 2.1094, 0));
        percentagesList.add(new PrizePosition(22, 0.0, 2.1094, 0));
        percentagesList.add(new PrizePosition(23, 0.0, 2.1094, 0));
        percentagesList.add(new PrizePosition(24, 0.0, 2.1094, 0));
        percentagesList.add(new PrizePosition(25, 0.0, 2.1094, 0));
        percentagesList.add(new PrizePosition(26, 0.0, 2.1094, 0));
        percentagesList.add(new PrizePosition(27, 0.0, 2.1094, 0));
    }

    @Override
    public void calculatePlayersWhoReceive(int registredPlayers, int reentries) {
        playersWhoRecieve = (registredPlayers + 2) / 10 + 2;
    }
}
