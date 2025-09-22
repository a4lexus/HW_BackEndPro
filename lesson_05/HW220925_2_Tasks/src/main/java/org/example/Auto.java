package org.example;

import java.util.Objects;

public class Auto {
    private int number;
    private String name;
    private int price;
    private String color;

    public Auto(int number, String name, int price, String color) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return number == auto.number;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }

    public Auto() {
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
