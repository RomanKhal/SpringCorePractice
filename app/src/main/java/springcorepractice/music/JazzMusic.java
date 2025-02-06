package springcorepractice.music;

import org.springframework.stereotype.Component;
import springcorepractice.InitDestroy;

import java.util.ArrayList;
import java.util.List;

//@Component
public class JazzMusic implements Music, InitDestroy {
    List<String > songs = List.of("jazz song1", "jazz song2", "jazz song3");
    @Override
    public List<String> getSongs() {
        return songs;
    }
}
