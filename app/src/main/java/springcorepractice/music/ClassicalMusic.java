package springcorepractice.music;

import org.springframework.stereotype.Component;
import springcorepractice.InitDestroy;

import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music, InitDestroy {
    private List<String> songs= List.of("classic song1","classic song2","classic song3");
    @Override
    public List<String> getSongs() {
        return songs;
    }
}
