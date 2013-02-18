package swingtournamentvisor.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CPTPrizeStruct extends PrizeStruct {

    public CPTPrizeStruct() {
    }

    @Override
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
}
