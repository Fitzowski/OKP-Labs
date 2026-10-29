package org.example;

public class Flower implements Growable, Blooming {
    private String name;
    private int height;
    private String color;

    public Flower(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void setHeight(int height) { this.height = height; }

    public void setColor(String color) { this.color = color; }

    @Override
    public void grow() {
        height = height + 5;
        System.out.println(name + " вырос до " + height + " см");
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void bloom() {
        System.out.println(name + " расцвёл, цвет: " + color);
    }

    @Override
    public String getFlowerColor() {
        return color;
    }
}