package springcorepractice.music;

import springcorepractice.InitDestroy;

public class JazzMusic implements Music, InitDestroy {
    @Override
    public String getSong() {
        return "jazz song";
    }
}
