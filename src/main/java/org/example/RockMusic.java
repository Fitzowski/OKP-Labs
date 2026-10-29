package org.example;

public class RockMusic extends Music {

    public RockMusic(String title, String artist, double duration) {
        super(title, artist, duration);
    }

    @Override
    public String getGenre() {
        return "рок";
    }
}