package org.example;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, Building> buildings = new HashMap<>();

        buildings.put("ЖК Солнечный", new Residential("ЖК Солнечный", 1, 12, 120));
        buildings.put("ЖК Лунный", new Residential("ЖК Лунный", 2, 9, 90));
        buildings.put("ЖК Звездный", new Residential("ЖК Звездный", 3, 16, 200));

        buildings.put("Бизнес-центр Альфа", new Office("Бизнес-центр Альфа", 4, 20, 15));
        buildings.put("Бизнес-центр Бета", new Office("Бизнес-центр Бета", 5, 10, 8));
        buildings.put("Бизнес-центр Гамма", new Office("Бизнес-центр Гамма", 6, 15, 12));

        buildings.put("Городская больница №1", new Hospital("Городская больница №1", 7, 6, 20));
        buildings.put("Городская больница №2", new Hospital("Городская больница №2", 8, 4, 12));

        for (Map.Entry<String, Building> entry : buildings.entrySet()) {
            System.out.println("Ключ: " + entry.getKey());
            System.out.println("значен: " + entry.getValue());

            System.out.println();
        }
    }
}