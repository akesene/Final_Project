package Code.simpleOutput;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class audio {

    // to store current position
    private long currentFrame;
    private Clip clip;

// current status of the clip
private String status;

    private AudioInputStream audioInputStream;

// constructor && intialized

    public audio ()throws UnsupportedAudioFileException,
            IOException,LineUnavailableException
    {

        setAudioInputStream(AudioSystem.
                getAudioInputStream(new File("/Users/ak/wolf.wav").getAbsoluteFile()));

        setClip(AudioSystem.getClip());

         // open audioinputstream to the clip
        getClip().open(getAudioInputStream());

        getClip().loop(Clip.LOOP_CONTINUOUSLY);

    }


    // define a play method for audio class

    public void play(){
        getClip().start();
        setStatus("play");
    }


    public void stop() throws UnsupportedAudioFileException,
            IOException, LineUnavailableException
    {
        currentFrame = 0L;
        clip.stop();
        clip.close();
    }


    // define all setter and get of the class field
    public long getCurrentFrame() {
        return currentFrame;
    }

    public void setCurrentFrame(long currentFrame) {
        this.currentFrame = currentFrame;
    }

    public Clip getClip() {
        return clip;
    }

    public void setClip(Clip clip) {
        this.clip = clip;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AudioInputStream getAudioInputStream() {
        return audioInputStream;
    }


    public void setAudioInputStream(AudioInputStream audioInputStream) {
        this.audioInputStream = audioInputStream;
    }

}
