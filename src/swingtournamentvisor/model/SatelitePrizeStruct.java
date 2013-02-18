package swingtournamentvisor.model;

public class SatelitePrizeStruct extends PrizeStruct{

    int packageAmount, rest;
    int subpackageAmount = 0;
    
    public SatelitePrizeStruct() {
        name = "Satelite Tournament";     
    }

    public void setPackageAmount(int packages) {
        this.packageAmount = packages;
    }

    public void setSubpackageAmount(int subpackages) {
        this.subpackageAmount = subpackages;
    }
    
    public void calculatePlayersWhoReceive() {
        playersWhoRecieve = handout/packageAmount;
        rest = handout % packageAmount;
    }

    @Override
    public void calculatePrizes() {
        calculatePlayersWhoReceive();
        percentagesList.clear();
        int i;
        for (i = 0; i < playersWhoRecieve; i++) {
            percentagesList.add(new PrizePosition(i + 1, 0.0, 0.0, packageAmount));
        }
        if (subpackageAmount != 0) {
            int x = rest / subpackageAmount;
            int y = rest % subpackageAmount;
            for (int j = 0; j < x; j++) {
                playersWhoRecieve++;
                percentagesList.add(new PrizePosition(percentagesList.size()+1, 0.0, 0.0, subpackageAmount));
            }
            if (y != 0)
                percentagesList.add(new PrizePosition(percentagesList.size()+1, 0.0, 0.0, y));
        } else {
            playersWhoRecieve++;
            percentagesList.add(new PrizePosition(percentagesList.size()+1, 0.0, 0.0, rest));
        }
    }
}
