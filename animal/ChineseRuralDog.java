package animal;

public class ChineseRuralDog extends Animal {
    private boolean isVaccineInjected;

    public ChineseRuralDog(String name, int age, String sex, double price, boolean isVaccineInjected) {
        super(name, age, sex, price);
        price = 1000;
        this.isVaccineInjected = isVaccineInjected;
    }

    public boolean isVaccineInjected() {
        return isVaccineInjected;
    }

    public String toString() {
        return "This Chinese Rural Dog names" + getName() + "it is " + getAge() + "tears old" +
                "it's sex is " + getSex() + ", it is " + getPrice() + "yuan. Does he has vaccineInjected?"
                + isVaccineInjected();
    }
}
