package org.example;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            System.out.println("=== Задание 1 ===");
            task1();

            System.out.println("\n=== Задание 2 ===");
            task2();

            System.out.println("\n=== Задание 3 ===");
            task3();

            System.out.println("\n=== Задание 4 ===");
            task4();

            System.out.println("\n=== Задание 5 ===");
            task5();

        } catch (IOException e) {
            System.out.println("Произошла ошибка при работе с файлами: " + e.getMessage());
        }
    }

    public static void task1() throws IOException {
        File file = new File("school.txt");

        try (PrintWriter writer = new PrintWriter(file)) {
            writer.println("Школа №208");
            writer.println("Город: Минск");
            writer.println("Количество учеников: 1100");
        }

        System.out.println("Данные о файле:");
        System.out.println("Имя: " + file.getName());
        System.out.println("Путь: " + file.getAbsolutePath());
        System.out.println("Размер: " + file.length() + " байт");

        System.out.println("\nИнформация из файла:");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }

    public static void task2() throws IOException {
        File file = new File("f.txt");
        Scanner console = new Scanner(System.in);

        try (PrintWriter writer = new PrintWriter(file)) {
            System.out.println("Введите 10 целых чисел:");
            int count = 0;
            while (count < 10) {
                try {
                    int num = console.nextInt();
                    writer.println(num);
                    count++;
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка! Введите именно целое число:");
                    console.next();
                }
            }
        }

        int countNegative = 0;
        System.out.print("Числа в файле: ");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                System.out.print(num + " ");
                if (num < 0) {
                    countNegative++;
                }
            }
        }
        System.out.println("\nКоличество отрицательных чисел: " + countNegative);
    }

    public static void task3() throws IOException {
        File f = new File("f.txt");
        File g = new File("g.txt");
        File h = new File("h.txt");
        Random random = new Random();

        try (PrintWriter writer = new PrintWriter(f)) {
            for (int i = 0; i < 10; i++) {
                writer.println(random.nextInt(100));
            }
        }

        try (Scanner scanner = new Scanner(f);
             PrintWriter writerG = new PrintWriter(g);
             PrintWriter writerH = new PrintWriter(h)) {

            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                int root = (int) Math.sqrt(num);
                if (root * root == num) {
                    writerG.println(num);
                } else {
                    writerH.println(num);
                }
            }
        }
        System.out.println("Файлы g.txt (квадраты) и h.txt (остальные) созданы.");
    }

    public static void task4() throws IOException {
        File file = new File("voltage.txt");
        Scanner console = new Scanner(System.in);
        console.useLocale(Locale.US);

        try (PrintWriter writer = new PrintWriter(file)) {
            System.out.println("Введите 10 вещественных значений напряжения (через точку, например 2.5):");
            int count = 0;
            while (count < 10) {
                try {
                    double num = console.nextDouble();
                    writer.println(num);
                    count++;
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка! Введите дробное число через точку:");
                    console.next();
                }
            }
        }

        double sum = 0;
        int count = 0;
        try (Scanner scanner = new Scanner(file)) {
            scanner.useLocale(Locale.US);
            while (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
                count++;
            }
        }

        System.out.println("Среднее напряжение: " + (sum / count));
    }

    public static void task5() throws IOException {
        File file = new File("f.txt");
        Random random = new Random();

        try (PrintWriter writer = new PrintWriter(file)) {
            for (int i = 0; i < 10; i++) {
                writer.println(random.nextInt(150) - 20);
            }
        }

        int countInRange = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num >= 1 && num <= 100) {
                    countInRange++;
                }
            }
        }
        System.out.println("Количество чисел в диапазоне от 1 до 100: " + countInRange);
    }
}