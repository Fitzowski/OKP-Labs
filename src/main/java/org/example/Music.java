package org.example;

public class Music {
    private String title;
    private String artist;
    private double duration;

    public Music(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public double getDuration() { return duration; }

    public void play() {
        System.out.println("играет музыка");
    }

    public void play(int repeat) {
        System.out.println("играет " + repeat + " раз");
    }
    public void play(int repeat1, int a) {
        System.out.println("играет " + repeat1 + " раз");
    }

    public void play(double speed) {
        System.out.println("играет со скоростью " + speed);
    }

    public String getGenre() {
        return "неизвестный жанр";
    }
}