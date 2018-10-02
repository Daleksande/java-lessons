package com.company.present;

class Chocolate extends Candy {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Chocolate(String type, String name, double wieght, double price, String color) {
        super(type, name, wieght, price);
        this.color = color;
    }
}