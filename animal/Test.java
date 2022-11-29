package animal;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        ArrayList<CustomerInformation> customer = new ArrayList<CustomerInformation>();
        double balance = 500;
        boolean isWork = true;
        MyAnimalShop shop = new MyAnimalShop(balance, animals, customer, isWork);
        System.out.println("商店初始值：\n" + shop.toString());
        System.out.println("===================================================");
        Cat ketty = new Cat("Ketty", 3, "female", 200);
        Cat puppy = new Cat("Puppy", 3, "female", 200);
        shop.buy(ketty.getName(), ketty.getAge(), ketty.getSex(), ketty.getPrice());
        shop.buy(puppy.getName(), puppy.getAge(), puppy.getSex(), puppy.getPrice());
        Customer jim = new Customer("Jim", 1, 2022, 11, 16);
        Customer tim = new Customer("tim", 1, 2022, 11, 16);
        Customer Jack = new Customer("Jack", 1, 2022, 11, 16);
        shop.setCustomer(jim.getName(), ketty.getName(), jim.getTimes(), ketty.getPrice(), jim.getYear(), jim.getMonth(), jim.getDay());
        shop.setCustomer(tim.getName(), puppy.getName(), tim.getTimes(), puppy.getPrice(), tim.getYear(), tim.getMonth(), tim.getDay());
        System.out.println(shop.toString());
        shop.rest(2022, 11, 16);
    }
}
