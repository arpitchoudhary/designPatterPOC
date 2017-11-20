package adapter;

public class AdapterDemo {

    public static void main(String... args){

        System.out.println("Normal MP3 File");

        MediaPlayer mediaPlayer = new NormalMediaPlayer();
        mediaPlayer.play();

        Adapter adapter = new Adapter(new AdvanceMediaPlayer());
        adapter.play();

    }
}
