package springcorepractice;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import springcorepractice.music.Music;
import springcorepractice.music.MusicGenres;

import java.util.List;
import java.util.Random;

//@Component
//@Scope(scopeName = "prototype")
public class MusicPlayer implements InitDestroy {
    private List<Music> musicList;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer() {
    }

    public MusicPlayer(List<Music> list) {
        this.musicList = list;
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

    public String playMusic() {
        return chooseSong(musicList.get(new Random().nextInt(musicList.size())));
    }

    private String chooseSong(Music music) {
        List<String> songs = music.getSongs();
        return songs.get(new Random().nextInt(songs.size()));
    }
}
