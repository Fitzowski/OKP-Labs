package org.example;

public class InvalidRestaurantDataException extends Exception {
    public InvalidRestaurantDataException(String message) {
        super(message);
    }
}