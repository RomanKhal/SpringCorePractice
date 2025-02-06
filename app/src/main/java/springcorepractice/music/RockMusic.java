package springcorepractice.music;

import springcorepractice.InitDestroy;

public class RockMusic implements Music, InitDestroy {
    @Override
    public String getSong() {
        return "rock song";
    }
}
