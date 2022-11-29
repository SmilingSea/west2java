package animal;

import java.time.LocalDate;
import java.util.ArrayList;

public class MyAnimalShop implements AnimalShop {
    private double balance;
    private ArrayList<String> animals;
    private ArrayList<CustomerInformation> customer;
    private boolean isWork;


    public MyAnimalShop(double balance, ArrayList<String> animals, ArrayList<CustomerInformation> customer, boolean isWork) {
        this.balance = balance;
        this.animals = animals;
        this.customer = customer;
        this.isWork = isWork;
    }


    public void buy(String name, int age, String sex, double price) {
        balance = balance - price;
        if (balance < 0) {
            throw new InsufficientBalanceException("余额不足");
        } else {
            System.out.println("已将" + name + "添加至您的宠物列表中。");
            System.out.println("您的余额为" + balance + "元");
            name.toString();
            animals.add(name);
        }
    }

    public void setCustomer(String customerName, String animalName, int times, double price, int year, int month, int day) {
        if (animals == null || animals.isEmpty()) {
            throw new AnimalNotFountException("商店目前还没有可出售的宠物。");
        } else {
            CustomerInformation customer1 = new CustomerInformation(customerName, year, month, day, price);
            customer.add(customer1);
            animals.remove(animalName);
            balance += price;
            animalName.toString();
        }
    }

    public void rest(int year, int month, int day) {
        double income = 0;
        isWork = false;
        LocalDate restTime = LocalDate.of(year, month, day);
        for (CustomerInformation cus : customer) {
            if (cus.getTime().isEqual(restTime)) {
                System.out.println(cus);
                income += cus.getPrice();
            }
        }
        System.out.println("今日总收入: " + income);
    }


    public String toString() {
        return "余额：" + balance + " \n宠物列表：" + animals + "\n顾客列表" + customer + "\n是否营业：" + isWork;
    }

}
