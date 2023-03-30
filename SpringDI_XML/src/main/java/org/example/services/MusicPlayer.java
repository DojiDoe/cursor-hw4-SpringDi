package org.example.services;

import org.example.services.ClassicalMusicPlayer;
import org.example.services.RockMusicPlayer;

public class MusicPlayer {

    private final ClassicalMusicPlayer classicalMusicPlayer;
    private final RockMusicPlayer rockMusicPlayer;


    public  MusicPlayer(ClassicalMusicPlayer classicalMusicPlayer,RockMusicPlayer rockMusicPlayer){
        this.classicalMusicPlayer = classicalMusicPlayer;
        this.rockMusicPlayer = rockMusicPlayer;
    }

    public void playRockMusic(){
        rockMusicPlayer.playMusic();
    }
    public  void playClassicMusic(){
        classicalMusicPlayer.playMusic();
    }

}
