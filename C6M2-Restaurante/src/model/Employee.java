package model;

public class Employee {
    private String name;
    private Restaurant restaurant;

    public Employee(String name, Restaurant restaurant) {
        this.name = name;
        this.restaurant = restaurant;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void getName(String name) {
        this.name = name;
    }
}
