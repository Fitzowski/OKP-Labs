package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Restaurant> restaurants = new ArrayList<>();

        System.out.println("Создание ресторанов");
        try {
            restaurants.add(new Restaurant("Пушкин", "Русская", 5, 3, "Тверская, 1"));
            restaurants.add(new Restaurant("Токио", "Японская", 4, 2, "Ленина, 10"));
            System.out.println("Список создан. Рестораны:");
            for (Restaurant r : restaurants) {
                System.out.println(" - " + r);
            }
        } catch (InvalidRestaurantDataException e) {
            System.out.println("Ошибка создания: " + e.getMessage());
        }

        System.out.println("\nПопытка создать неверный ресторан");
        try {
            Restaurant bad = new Restaurant("Плохой", "Фастфуд", 10, 1, "Адрес");
        } catch (InvalidRestaurantDataException e) {
            System.out.println("Ошибка создания: " + e.getMessage());
        }

        System.out.println("\nОбновление данных (Сеттеры)");
        try {
            restaurants.get(1).setRating(5);
            System.out.println("Рейтинг Токио обновлен до: " + restaurants.get(1).getRating());
            restaurants.get(0).setRating(10);
        } catch (InvalidRestaurantDataException e) {
            System.out.println("Ошибка обновления рейтинга: " + e.getMessage());
        }

        System.out.println("\nБронирование столиков");
        try {
            restaurants.get(0).bookTable(4);
            restaurants.get(1).bookTable(-1);
        } catch (BookingException e) {
            System.out.println("Ошибка бронирования: " + e.getMessage());
        }

        System.out.println("\nПоиск ресторана");
        try {
            Restaurant found = findRestaurantByName(restaurants, "Макдоналдс");
            System.out.println("Найден: " + found);
        } catch (RestaurantNotFoundException e) {
            System.out.println("Ошибка поиска: " + e.getMessage());
        }
    }

    public static Restaurant findRestaurantByName(List<Restaurant> list, String name)
            throws RestaurantNotFoundException {
        for (Restaurant r : list) {
            if (r.getName().equalsIgnoreCase(name)) {
                return r;
            }
        }
        throw new RestaurantNotFoundException("Ресторан с названием '" + name + "' не найден в базе.");
    }
}