package animal;

import java.time.LocalDate;

public interface AnimalShop {
    public void buy(String name, int age, String sex, double price);

    public void setCustomer(String customerName, String animalName, int times, double price, int year, int month, int day);

    public void rest(int year, int month, int day);
}
