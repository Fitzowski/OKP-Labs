package org.example;

public class Residential extends Building {
    private int apartments;

    public Residential(String name, int id, int floors, int apartments) {
        super(name, id, floors);
        this.apartments = apartments;
    }

    public int getApartments() { return apartments; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Тип: жилой, квартир: " + apartments);
    }

    @Override
    public String toString() {
        return super.toString() + " тип жилой, квартир: " + apartments;
    }
}