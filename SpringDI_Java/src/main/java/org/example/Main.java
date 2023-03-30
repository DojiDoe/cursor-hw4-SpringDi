package org.example;

import org.example.services.MusicPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MusicPlayer classicalMusicPlayer = context.getBean(MusicPlayer.class);
        classicalMusicPlayer.playClassicMusic();
        context.close();
    }
}
