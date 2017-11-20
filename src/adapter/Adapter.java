package adapter;

public class Adapter implements MediaPlayer {

    private AdvancePlayer player;

    public Adapter(AdvancePlayer player) {
        this.player = player;
    }

    @Override
    public void play() {
        player.playVLC();
    }
}
