package gof.adapter;

public class AdvancedPlayer {
    public void playVlc(String fileName){
        System.out.println("vlc is playing");
    }

    public void playMp4(String fileName){
        System.out.println("mp4 is playing");
    }
}
