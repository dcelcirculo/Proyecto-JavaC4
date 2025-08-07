package model;

public class Table {
    private Restaurant restaurant;
    private Integer tableNumber;
    private Integer capacity;
    private boolean occupied;
    private Order currentOrder;

    public Table(Integer tableNumber, Integer capacity, Restaurant restaurant) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.restaurant = restaurant;
        this.occupied = false;
    }

    public Integer getTableNumber() {
        return tableNumber;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public Order getCurrentOrder() {
        return currentOrder;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public void setCurrentOrder(Order currentOrder) {
        this.currentOrder = currentOrder;
    }

    public void assignOrder(Order order) {
        this.currentOrder = order;
        this.occupied = true;
    }

    public void clearTable() {
        this.occupied = false;
        this.currentOrder = null;
    }
}
