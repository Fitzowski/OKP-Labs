package org.example;

public class App {
    public static void main(String[] args) {
        Music music1 = new Music("Песня 1", "Исполнитель 1", 3.5);
        RockMusic rock = new RockMusic("Bohemian Rhapsody", "Queen", 5.5);
        ClassicalMusic classic = new ClassicalMusic("Лунная соната", "Бетховен", 6.0);

        System.out.println("1. перегрузка методов (статический полиморфизм)");
        music1.play();
        music1.play(3);
        music1.play(1.5);

        System.out.println("\n2. переопределение методов (динамический полиморфизм)");
        Music[] playlist = {music1, rock, classic};

        for (Music m : playlist) {
            System.out.println(m.getTitle() + " - жанр: " + m.getGenre());
        }

        System.out.println("\n3. полиморфный вызов");
        for (Music m : playlist) {
            m.play();
        }
    }
}