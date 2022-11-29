package animal;

import java.time.LocalDate;

public class CustomerInformation {
    private String name;
    private LocalDate time;
    private double price;

    public CustomerInformation(String name, int year, int month, int day, double price) {
        this.name = name;
        this.time = LocalDate.of(year, month, day);
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public LocalDate getTime() {
        return time;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return " name: " + getName() + " time " + getTime() + " price: " + getPrice();
    }

}
