package org.example;

public class Office extends Building {
    private int companies;

    public Office(String name, int id, int floors, int companies) {
        super(name, id, floors);
        this.companies = companies;
    }

    public int getCompanies() { return companies; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Тип: офисный, компаний: " + companies);
    }

    @Override
    public String toString() {
        return super.toString() + "тип офисный, компаний: " + companies;
    }
}