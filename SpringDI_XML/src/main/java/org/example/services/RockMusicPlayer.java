package org.example.services;

import org.example.Soundtrack;

import java.util.List;

public class RockMusicPlayer implements Music {
    private List<Soundtrack> rockMusic;
    public void playMusic(){
        rockMusic.forEach(track -> System.out.println("Artist - " + track.getArtist() + " " + " Song - " + track.getTitle()));
    }
    public void setMusic(List<Soundtrack> music) {
        this.rockMusic = music;
    }
}
