package model;

public class Restaurant {
    private String name;
    private String address;
    private Table[] tables;
    private Employee[] employees;
    private Menu menu;

    public Restaurant(Table[] tables, Employee[] employees, Menu menu) {
        this.name = "My Restaurant";
        this.address = "Calle 100";
        this.tables = tables;
        this.employees = employees;
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Table[] getTables() {
        return tables;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private void displayMenu() {
        menu.displayItems();
    }

    private Table findTable(int tableNumber) {
        for (int i = 0; i < tables.length; i++) {
            if (tables[i].getTableNumber() == tableNumber) {
                return tables[i];
            }
        }
        return null;
    }
}
