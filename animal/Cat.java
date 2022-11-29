package animal;

public class Cat extends Animal {
    public Cat(String name, int age, String sex, double price) {
        super(name, age, sex, price);
        price = 200;
    }

    public String toString() {
        return "This cat names" + getName() + "it is " + getAge() + "tears old" +
                "it's sex is " + getSex() + ", it is " + getPrice() + "yuan. ";
    }

}
