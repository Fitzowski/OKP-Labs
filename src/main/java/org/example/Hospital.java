package org.example;

public class Hospital extends Building {
    private int departments;

    public Hospital(String name, int id, int floors, int departments) {
        super(name, id, floors);
        this.departments = departments;
    }

    public int getDepartments() { return departments; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Тип: больница, отделений: " + departments);
    }

    @Override
    public String toString() {
        return super.toString() + " тип больница отделений: " + departments;
    }
}