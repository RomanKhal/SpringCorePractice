package springcorepractice.music;

import org.springframework.stereotype.Component;
import springcorepractice.InitDestroy;

import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music, InitDestroy {
    private List<String> songs= List.of("rock song1","rock song2","rock song3");
    @Override
    public List<String> getSongs() {
        return songs;
    }

}
