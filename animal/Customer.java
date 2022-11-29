package animal;

import java.time.*;

public class Customer {
    private String name;
    private int times;
    private LocalDate time;
    private int year;
    private int month;
    private int day;

    public Customer(String name, int times, int year, int month, int day) {
        this.name = name;
        this.times = times;
        this.time = LocalDate.of(year, month, day);
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public int getTimes() {
        return times;
    }

    public LocalDate getTime() {
        return time;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }


    @Override
    public String toString() {
        return "name:" + getName() + " times:" + getTimes() + " time:" + getTime();
    }

}
