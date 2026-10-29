package org.example;

public class ClassicalMusic extends Music {

    public ClassicalMusic(String title, String artist, double duration) {
        super(title, artist, duration);
    }

    @Override
    public String getGenre() {
        return "классика";
    }
}