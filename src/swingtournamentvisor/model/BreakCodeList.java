package swingtournamentvisor.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@SuppressWarnings("serial")
public class BreakCodeList extends ArrayList<String> {

    public BreakCodeList() {
        add("DB");
        add("CR");
        add("ED");
    }

    @XmlElement(name = "breakCode")
    public List<String> getBreakCodeList() {
        return this;
    }
    
    public boolean isInBreakCodeList(String code) {
        for (Iterator<String> it = this.iterator(); it.hasNext();) {
            String c = it.next();
            if (code.equals(c)) {
                return true;
            }
        }
        return false;
    }
}
