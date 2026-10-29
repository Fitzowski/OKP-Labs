package org.example.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task2Main {
    public static void main(String[] args) {
        List<Game> games = new ArrayList<>();
        games.add(new Game(1, "Ведьмак 3", "RPG", 5, List.of(5, 4, 5, 4, 5)));
        games.add(new Game(6, "Ведьмак 4", "RPG", 5, List.of(5, 4, 5, 4, 5)));
        games.add(new Game(2, "Мортал Комбат", "Fighting", 4, List.of(4, 4, 3, 5)));
        games.add(new Game(3, "Симулятор фермы", "Simulator", 2, List.of(2, 1, 3, 2)));
        games.add(new Game(4, "Дум", "Shooter", 5, List.of(5, 5, 5, 4)));
        games.add(new Game(5, "Сапёр", "Puzzle", 1, List.of(1, 2, 1, 1)));

        System.out.println("До фильтрации");
        games.forEach(System.out::println);

        games.removeIf(game -> game.getAverageScore() < 3);
        System.out.println("\nПосле удаления (средний < 3)");
        games.forEach(System.out::println);

        for (Game g : games) {
            if (g.getAverageScore() >= 4) {
                g.setRating(g.getRating() + 1);
            }
        }
        System.out.println("\nПосле повышения рейтинга (средний >= 4)");
        games.forEach(System.out::println);

        System.out.println("\nПечать игр с рейтингом 5");
        printGames(games, 5);

        games.sort(
                Comparator.comparingDouble(Game::getAverageScore).reversed()
                        .thenComparing(Game::getTitle, Comparator.reverseOrder())
        );
        System.out.println("\nСортировка по убыванию среднего балла");
        games.forEach(System.out::println);
    }

    public static void printGames(List<Game> games, int rating) {
        for (Game g : games) {
            if (g.getRating() == rating) {
                System.out.println(g.getId() + " " + g.getTitle() + " " + g.getAverageScore());
            }
        }
    }
}