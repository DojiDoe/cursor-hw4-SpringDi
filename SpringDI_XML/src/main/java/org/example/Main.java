package org.example;

import org.example.services.Music;
import org.example.services.MusicPlayer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer classicalMusicPlayer = context.getBean(MusicPlayer.class);
        classicalMusicPlayer.playClassicMusic();
    }
}
