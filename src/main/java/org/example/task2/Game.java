package org.example.task2;

import java.util.List;

public class Game {
    private int id;
    private String title;
    private String genre;
    private int rating;
    private List<Integer> playerScores;

    public Game(int id, String title, String genre, int rating, List<Integer> playerScores) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.playerScores = playerScores;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getGenre() { return genre; }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }

    public List<Integer> getPlayerScores() { return playerScores; }

    public double getAverageScore() {
        if (playerScores.isEmpty()) return 0;
        int sum = 0;
        for (int score : playerScores) {
            sum = sum + score;
        }
        return (double) sum / playerScores.size();
    }

    @Override
    public String toString() {
        return id + " - " + title + " (средний балл: " + getAverageScore() + ")";
    }
}