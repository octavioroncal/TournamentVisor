package swingtournamentvisor.model;

public class CustomPrizeStruct extends PrizeStruct {

    boolean mode;
    double j, m, c;
    double percentage;

    public CustomPrizeStruct() {
        name = "Custom Prizes";
    }

    public void setMode(boolean mode) {
        this.mode = mode;
    }

    public void setJ(double j) {
        this.j = j;
    }

    public void setM(double m) {
        this.m = m;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setPercentage(double value_prsnlzd) {
        this.percentage = value_prsnlzd;
    }

    @Override
    public void calculatePlayersWhoReceive(int entradas, int reentradas) {
        if (!mode) {
            playersWhoRecieve = (int) ((j / m) * getRegistredPlayers() + c);
        } else {
            playersWhoRecieve = (int) ((j / m) * (getRegistredPlayers() + getReentries()) + c);
        }
        if (playersWhoRecieve > getRegistredPlayers()) {
            playersWhoRecieve = getRegistredPlayers();
        }
    }

    @Override
    public void calculateAbsPercentages() {
        double cprize_total = 100.0;
        percentagesList.clear();
        percentagesList.add(new PrizePosition(1, 0.0, 100.0, 0));
        for (int n = 1; n < playersWhoRecieve; n++) {
            percentagesList.add(n, new PrizePosition(n + 1, 0.0, 0.0, 0));
            percentagesList.get(n).setRelPercentage(percentagesList.get(n - 1).getRelPercentage() * (percentage / 100.0));
            cprize_total += percentagesList.get(n).getRelPercentage();
        }
        System.out.println("\n");
        for (int n = 0; n < playersWhoRecieve; n++) {
            percentagesList.get(n).setAbsPercentage((percentagesList.get(n).getRelPercentage() * 100) / cprize_total);
        }
    }
}
