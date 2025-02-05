package springcorepractice;

import springcorepractice.music.Music;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer(){}

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }


    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic(){
        System.out.println(musicList.size());
        for (var music : musicList){
            System.out.println("Plays " + music.getSong());
        }
        System.out.println("Name=" + this.getName() + " volume=" + this.getVolume());
    }
}
