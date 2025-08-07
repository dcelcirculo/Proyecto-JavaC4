package model;

public class Order {
    private Integer orderNumber;
    private OrderStatus status;
    private OrderItem[] orderItems;
    private Table table;

    public Order(Table table, Integer orderItemSize) {
        this.table = table;
        this.orderNumber = 1;
        this.status = OrderStatus.PENDING;
        this.orderItems = new OrderItem[orderItemSize];
    }

    public void addItem(OrderItem item) {
        for (int i = 0; i < orderItems.length; i++) {
            if (orderItems[i] == null) {
                orderItems[i] = item;
                return;
            }
        }
        System.err.println("El pedido está lleno.");
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public OrderItem[] getItems() {
        return orderItems;
    }

    public Table getTable() {
        return table;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < orderItems.length; i++) {
            if (orderItems[i] != null) {
                total += orderItems[i].calculateSubtotal();
            }
        }
        return total;
    }

    public void displayItems() {
        System.out.printf("Pedido No: %d%nEstado: %s%n", orderNumber, status);
        System.out.println("=== Productos del pedido ===");
        for (int i = 0; i < orderItems.length; i++) {
            if (orderItems[i] != null) {
                var item = orderItems[i];
                System.out.printf("Nombre: %s, Cantidad: %d, Subtotal: $ %,.2f", item.getMenuItem().getName(),
                        item.getQuantity(), item.calculateSubtotal());
            }
        }
    }

}
