package com.company.present2;

public class Choco extends Sweet {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Choco(String name, double wieght, double price, int count, String color) {
        super(name, wieght, price, count);
        this.color = color;
    }

    public Choco(int count) {
        super("Mars", 10.5, 45.5, count);
        color = "black";
    }

}
