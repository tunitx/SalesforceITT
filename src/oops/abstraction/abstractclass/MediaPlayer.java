package oops.abstraction.abstractclass;

public abstract class MediaPlayer {
    abstract void play();
    abstract void pause();
    abstract void next();
    abstract void previous();
}

class Media extends MediaPlayer{

    @Override
    void play() {
        System.out.println("song played");
    }

    @Override
    void pause() {
        System.out.println("song paused");
    }

    @Override
    void next() {
        System.out.println("next song");
    }

    @Override
    void previous() {
        System.out.println("prev song");
    }
}
