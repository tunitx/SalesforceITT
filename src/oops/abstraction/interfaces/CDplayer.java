package oops.abstraction.interfaces;

public class CDplayer implements MediaPlayer {
    @Override
    public void stop() {
        System.out.println("ganna stopped");
    }

    @Override
    public void play() {
        System.out.println("gaaana chal gya");
    }

    @Override
    public void pause() {
        System.out.println("gaana paused");
    }
}
