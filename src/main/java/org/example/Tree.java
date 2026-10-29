package org.example;

public class Tree implements Growable, Blooming {
    private String name;
    private int height;
    private int crownDiameter;
    private String flowerColor;

    public Tree(String name, int height, int crownDiameter, String flowerColor) {
        this.name = name;
        this.height = height;
        this.crownDiameter = crownDiameter;
        this.flowerColor = flowerColor;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void setHeight(int height) { this.height = height; }

    public int getCrownDiameter() { return crownDiameter; }
    public void setCrownDiameter(int crownDiameter) { this.crownDiameter = crownDiameter; }

    public void setFlowerColor(String flowerColor) { this.flowerColor = flowerColor; }

    @Override
    public void grow() {
        height = height + 10;
        System.out.println(name + " вырос до " + height + " м");
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void bloom() {
        System.out.println(name + " цветёт");
    }

    @Override
    public String getFlowerColor() {
        return flowerColor;
    }
}