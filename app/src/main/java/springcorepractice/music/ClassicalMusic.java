package springcorepractice.music;

import springcorepractice.InitDestroy;

public class ClassicalMusic implements Music, InitDestroy {
    private ClassicalMusic(){}
    public static ClassicalMusic getClassicalMusic(){
        System.out.println("used fabric method " + ClassicalMusic.class.getSimpleName());
        return new ClassicalMusic();
    }
    @Override
    public String getSong() {
        return "classic song";
    }
}
