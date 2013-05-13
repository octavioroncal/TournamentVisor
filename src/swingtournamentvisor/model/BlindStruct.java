package swingtournamentvisor.model;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement
@XmlSeeAlso({Level.class, BreakCodeList.class})
public class BlindStruct  {
    
    private ArrayList<Level> levelList = new ArrayList<>();
    private BreakCodeList breakCodeList = new BreakCodeList();
    private String name;
    private Integer duration = new Integer(0);

    public Level nextLevel(Level level) {
        for (Level l : levelList) {
            if (l.getLevel() == level.getLevel()) {
                return levelList.get((levelList.indexOf(l)) + 1);
            }
        }
        return level;
    }

    public Level previousLevel(Level level) {
        try {
            for (Level l : levelList) {
                if (l.getLevel() == level.getLevel()) {
                    return levelList.get((levelList.indexOf(l)) - 1);
                }
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException ex) {
            System.out.println("BLinds error"+ ex.getMessage());
        }
        return level;
    }
    
    public Level get(int index){
        return levelList.get(index);
    }

    public Level getLastLevel(){
        return levelList.get(levelList.size()-1);
    }
    
    @XmlElement
    public ArrayList<Level> getLevelList() {
        return levelList;
    }
    
    public void setLevelList(ArrayList<Level> levelList) {
        this.levelList = levelList;
    }
    
    @XmlAttribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInBreakCodeList(String code) {
        for (String c : breakCodeList) {
            if (code.equals(c)) {
                return true;
            }
        }
        return false;
    }

    @XmlElement
    public BreakCodeList getBreakCodeList() {
        return breakCodeList;
    }
}
