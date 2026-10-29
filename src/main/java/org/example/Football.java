package org.example;

public class Football extends SportGame {
    private int goals;

    public Football(String name, int players, int duration, int goals) {
        super(name, players, duration);
        this.goals = goals;
    }

    public int getGoals() { return goals; }
    public void setGoals(int goals) { this.goals = goals; }

    @Override
    public String getRules() {
        return "2 тайма по 45 минут";
    }

    @Override
    public String getScore() {
        return "Гол = 1 очко";
    }
}