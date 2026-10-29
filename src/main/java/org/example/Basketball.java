package org.example;

public class Basketball extends SportGame {
    private int quarters;

    public Basketball(String name, int players, int duration, int quarters) {
        super(name, players, duration);
        this.quarters = quarters;
    }

    public int getQuarters() { return quarters; }
    public void setQuarters(int quarters) { this.quarters = quarters; }

    @Override
    public String getRules() {
        return "4 четверти по 10 минут";
    }

    @Override
    public String getScore() {
        return "Бросок = 2 или 3 очка";
    }
}