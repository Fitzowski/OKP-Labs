package org.example;


import test.Eagle;

public class App {
    public static void main(String[] args) {
        Eagle myEagle = new Eagle("орел");

        myEagle.makeSound();
        myEagle.fly();
    }
}