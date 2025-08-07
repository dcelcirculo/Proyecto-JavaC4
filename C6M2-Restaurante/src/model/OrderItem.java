package model;

public class OrderItem {
    private MenuItem menuItem;
    private Integer quantity;
    private Order order;

    public OrderItem(Order order, MenuItem menuItem, Integer quantity) {
        this.order = order;
        this.menuItem = menuItem;
        this.quantity = quantity;
    }

    public OrderItem(Order order, MenuItem menuItem) {
        this(order, menuItem, 1);
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Order getOrder() {
        return order;
    }

    public Double calculateSubtotal() {
        return menuItem.getPrice() * quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
