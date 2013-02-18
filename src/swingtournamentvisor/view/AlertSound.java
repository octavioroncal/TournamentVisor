package swingtournamentvisor.view;

import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AlertSound extends Thread {

    private final String file;

    public AlertSound(String filename) {
        file = filename;
    }

    @Override
    public void run() {
        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(AlertSound.class.getResourceAsStream(file));
            clip.open(inputStream);
            clip.start();
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
            System.err.println(e.getMessage());
            System.out.println(e.getMessage());
        }
    }
}
