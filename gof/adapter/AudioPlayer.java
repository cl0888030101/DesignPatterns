package gof.adapter;

public class AudioPlayer implements MediaPlayer{

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("mp3 is playing");
        }else if(audioType.equalsIgnoreCase("mp4")
                || audioType.equalsIgnoreCase("vlc")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else {
            System.out.println("no function to play");
        }
    }
}
