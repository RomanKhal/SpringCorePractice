package springcorepractice;

import org.springframework.context.annotation.*;
import springcorepractice.music.ClassicalMusic;
import springcorepractice.music.JazzMusic;
import springcorepractice.music.Music;
import springcorepractice.music.RockMusic;

import java.util.ArrayList;
import java.util.List;

@Configuration
//@ComponentScan("springcorepractice")
@PropertySource("musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public JazzMusic jazzMusic(){
        return new JazzMusic();
    }

    @Bean
    public List<Music> musicList(){
        return List.of(classicalMusic(), rockMusic(), jazzMusic());
    }
    @Bean
    @Scope("prototype")
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }
}
