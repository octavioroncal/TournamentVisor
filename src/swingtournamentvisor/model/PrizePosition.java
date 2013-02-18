package swingtournamentvisor.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PrizePosition implements Cloneable {

    private Integer position;
    private Double absPercentage;
    private Double relPercentage;
    private Integer money;

    public PrizePosition() {
    }

    public PrizePosition(Integer position, Double absPercentage, Double relPercentage, Integer money) {
        this.position = position;
        this.absPercentage = absPercentage;
        this.relPercentage = relPercentage;
        this.money = money;
    }

    public Integer positionProperty() {
        return position;
    }

    public Double absPercentageProperty() {
        return absPercentage;
    }

    public Double relPercentageProperty() {
        return relPercentage;
    }

    public Integer moneyProperty() {
        return money;
    }

    @XmlElement
    public Integer getPosition() {
        return position;
    }

    @XmlElement
    public Double getAbsPercentage() {
        return absPercentage;
    }

    @XmlElement
    public Double getRelPercentage() {
        return relPercentage;
    }

    @XmlElement
    public Integer getMoney() {
        return money;
    }

    public void setAbsPercentage(Double absPercentage) {
        this.absPercentage = absPercentage;
    }

    public void setRelPercentage(Double relPercentage) {
        this.relPercentage = relPercentage;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "PrizePosition{" + "position=" + position + ", absPercentage=" + absPercentage + ", relPercentage=" + relPercentage + ", money=" + money + '}';
    }
}
