package org.example.services;

import org.example.Soundtrack;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusicPlayer implements Music {
    private List<Soundtrack> rockMusic;
    public void playMusic(){
        rockMusic.forEach(track -> System.out.println("Artist - " + track.getArtist() + " " + " Song - " + track.getTitle()));
    }
    @Override
    public void setMusic(List<Soundtrack> music) {
        this.rockMusic = music;
    }

    @PostConstruct
    public void init(){
        rockMusic = new ArrayList<>();
        rockMusic.add(new Soundtrack("Whole Lotta Love","Led ZeppeLin"));
        rockMusic.add(new Soundtrack("Smoke on the Water","Deep Purple"));
    }

}
