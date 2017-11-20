package adapter;

public class NormalMediaPlayer implements MediaPlayer {

    @Override
    public void play() {
        System.out.println("Playing MP3");
    }
}
