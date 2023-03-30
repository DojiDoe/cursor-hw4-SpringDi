package org.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private final ClassicalMusicPlayer classicalMusicPlayer;
    private final RockMusicPlayer rockMusicPlayer;

    @Autowired
    public MusicPlayer(ClassicalMusicPlayer classicalMusicPlayer, RockMusicPlayer rockMusicPlayer) {
        this.classicalMusicPlayer = classicalMusicPlayer;
        this.rockMusicPlayer = rockMusicPlayer;
    }

    public void playRockMusic() {
        rockMusicPlayer.playMusic();
    }

    public void playClassicMusic() {
        classicalMusicPlayer.playMusic();
    }

}
