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

@Component
@Scope(scopeName = "prototype")
public class MusicPlayer implements InitDestroy {
    @Autowired
    @Qualifier("rockMusic")
    private Music music1;
    @Autowired
    @Qualifier("classicalMusic")
    private Music music2;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer() {
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

    public String playMusic(MusicGenres value) {
        switch (value) {
            case ROCK -> {
                return chooseSong(music1);
            }
            case CLASSICAL -> {
                return chooseSong(music2);
            }
        }
        return "it's not a rock or classic genre";
    }

    private String chooseSong(Music music) {
        List<String> songs = music.getSongs();
        return songs.get(new Random().nextInt(songs.size()));
    }
}
