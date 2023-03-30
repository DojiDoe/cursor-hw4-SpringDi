package org.example.services;

import org.example.Soundtrack;

import java.util.List;

public class ClassicalMusicPlayer implements Music {
    private List<Soundtrack> classicMusic;
    public void playMusic(){
        classicMusic.forEach(track -> System.out.println("Artist - " + track.getArtist() + " " + " Song - " + track.getTitle()));
    }
    public void setMusic(List<Soundtrack> music) {
        this.classicMusic = music;
    }
}
