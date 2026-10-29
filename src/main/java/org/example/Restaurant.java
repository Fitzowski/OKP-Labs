package org.example;

public class Restaurant {
    private String name;
    private String cuisine;
    private int rating;
    private int priceLevel;
    private String address;

    public Restaurant(String name, String cuisine, int rating, int priceLevel, String address)
            throws InvalidRestaurantDataException {
        this.setName(name);
        this.cuisine = cuisine;
        this.setRating(rating);
        this.setPriceLevel(priceLevel);
        this.address = address;
    }

    public String getName() { return name; }
    public String getCuisine() { return cuisine; }
    public int getRating() { return rating; }
    public int getPriceLevel() { return priceLevel; }
    public String getAddress() { return address; }

    public void setName(String name) throws InvalidRestaurantDataException {
        if (name == null || name.isEmpty()) {
            throw new InvalidRestaurantDataException("Имя не может быть пустым");
        }
        this.name = name;
    }

    public void setRating(int rating) throws InvalidRestaurantDataException {
        if (rating < 1 || rating > 5) {
            throw new InvalidRestaurantDataException("Рейтинг должен быть от 1 до 5");
        }
        this.rating = rating;
    }

    public void setPriceLevel(int priceLevel) throws InvalidRestaurantDataException {
        if (priceLevel < 1 || priceLevel > 3) {
            throw new InvalidRestaurantDataException("Уровень цен должен быть от 1 до 3");
        }
        this.priceLevel = priceLevel;
    }

    public void setCuisine(String cuisine) { this.cuisine = cuisine; }
    public void setAddress(String address) { this.address = address; }

    public void bookTable(int persons) throws BookingException {
        if (persons <= 0) {
            throw new BookingException("Количество человек должно быть больше нуля");
        }
        System.out.println("Столик на " + persons + " чел. в ресторане '" + name + "' забронирован.");
    }

    @Override
    public String toString() {
        return name + " (" + cuisine + ", рейтинг: " + rating + ", цены: " + priceLevel + ")";
    }
}