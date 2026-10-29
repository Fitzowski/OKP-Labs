package org.example;

public class App {
    public static void main(String[] args) {
        Growable[] plants = {
                new Tree("Дуб", 100, 50, "зелёный"),
                new Tree("Берёза", 80, 40, "белый"),
                new Tree("Сосна", 120, 30, "жёлтый"),
                new Flower("Роза", 30, "красный"),
                new Flower("Тюльпан", 20, "жёлтый")
        };

        for (Growable plant : plants) {
            plant.grow();

            if (plant instanceof Blooming) {
                Blooming bloomable = (Blooming) plant;
                bloomable.bloom();
            }

            System.out.println();
        }
    }
}