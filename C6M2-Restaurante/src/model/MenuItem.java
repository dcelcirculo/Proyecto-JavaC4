package model;

public class MenuItem {
    private Menu menu;
    private String name;
    private Double price;

    public MenuItem(Menu menu, String name, double price) {
        this.menu = menu;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return String.format("%s: \t$ %.2f", name, price);
    }

}
