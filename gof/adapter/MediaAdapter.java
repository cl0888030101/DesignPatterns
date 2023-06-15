package gof.adapter;

/*
* Adapter class: use other instance to implement the target interface
* Since there is no play() function in Advanced player class, then create this media adapter class to implement the play function
* */

public class MediaAdapter implements MediaPlayer{
    private AdvancedPlayer advancedPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            advancedPlayer = new AdvancedPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedPlayer.playMp4(fileName);
        }
    }
}
