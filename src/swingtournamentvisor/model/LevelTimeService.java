package swingtournamentvisor.model;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class LevelTimeService {

    private ArrayList<LevelTimeListener> listenerList = new ArrayList<>();
    private Integer timeInseconds = 0;
    private Timer timer;
    private Boolean running = false;

    public LevelTimeService() {
    }

    @XmlElement
    public synchronized Integer LevelTimeProperty() {
        return timeInseconds;
    }

    public synchronized void setLevelTime(int levelTime) {
        synchronized (timeInseconds) {
            timeInseconds = levelTime;
        }
        synchronized (listenerList) {
            for (LevelTimeListener listener : listenerList) {
                listener.timeChanged(timeInseconds);
            }
        }
    }

    public Boolean isRunning() {
        return running;
    }

    public void addTimeListener(LevelTimeListener listener) {
        listenerList.add(listener);
    }

    public synchronized ArrayList<LevelTimeListener> getListenerList() {
        return listenerList;
    }

    public synchronized int getLevelTime() {
        synchronized (timeInseconds) {
            return timeInseconds;
        }
    }

    public void refreshTime(int seconds) {
        setLevelTime(seconds);
    }

    public void stop() {
        synchronized (running) {
            if (running) {
                timer.cancel();
                running = false;
            }
        }
    }

    public void start() {
        synchronized (running) {
            if (!running) {
                running = true;
                timer = new Timer();
                TimerTask timerTask = new TimerTask() {
                    @Override
                    public void run() {
                        changeTime();
                    }
                };
                timer.scheduleAtFixedRate(timerTask, 0, 1000);
            }
        }
    }
    
    private void changeTime() {
        synchronized (timeInseconds) {
           timeInseconds --; 
        }
        synchronized (listenerList) {
            for (LevelTimeListener listener : listenerList) {
                listener.timeChanged(timeInseconds);
            }
        }
    }
}
