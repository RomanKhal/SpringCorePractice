package springcorepractice.music;

import org.springframework.stereotype.Component;
import springcorepractice.InitDestroy;

import java.util.ArrayList;
import java.util.List;

//@Component
public class JazzMusic implements Music, InitDestroy {
    List<String > songs = new ArrayList<>();
    @Override
    public List<String> getSongs() {
        return songs;
    }
}
