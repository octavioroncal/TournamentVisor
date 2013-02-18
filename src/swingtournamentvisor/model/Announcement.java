package swingtournamentvisor.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Announcement {

    String announcement = new String("");
    boolean active;
    boolean highlight;

    public Announcement(String announcement, Boolean active, Boolean highlight) {
        this.announcement = announcement;
        this.active = active;
        this.highlight = highlight;
    }

    public Announcement() {
    }

    @XmlAttribute
    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    @XmlAttribute
    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @XmlAttribute
    public Boolean isHighlight() {
        return highlight;
    }

    public void setHighlight(Boolean highlight) {
        this.highlight = highlight;
    }

    public String announcementProperty() {
        return announcement;
    }

    public boolean activeProperty() {
        return active;
    }

    public boolean highlightProperty() {
        return highlight;
    }
}
