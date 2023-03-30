package org.example;


import org.example.services.ClassicalMusicPlayer;
import org.example.services.MusicPlayer;
import org.example.services.RockMusicPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Config {
    @Bean
    ClassicalMusicPlayer classicPlayer(){
        ClassicalMusicPlayer cmp = new ClassicalMusicPlayer();
        List<Soundtrack> soundtrackList = new ArrayList<>();
        soundtrackList.add(new Soundtrack("Symphony No 5","Ludwig wan Beethoven"));
        soundtrackList.add(new Soundtrack("MoonLight Sonata", "Ludwig wan Beethoven"));
        cmp.setMusic(soundtrackList);
        return cmp;
    }

    @Bean
    RockMusicPlayer rockPlayer(){
        RockMusicPlayer rmp = new RockMusicPlayer();
        List<Soundtrack> soundtrackList = new ArrayList<>();
        soundtrackList.add(new Soundtrack("Whole Lotta Love","Led ZeppeLin"));
        soundtrackList.add(new Soundtrack("Smoke on the Water","Deep Purple"));
        rmp.setMusic(soundtrackList);
        return rmp;
    }

    @Bean
    MusicPlayer musicPlayer(){
        return new MusicPlayer(classicPlayer(),rockPlayer());
    }
}
