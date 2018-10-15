package com.company.present2;

public class Sweet {
    private String name;
    private double wieght;
    private double price;
    private int count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWieght() {
        return wieght;
    }

    public void setWieght(double wieght) {
        this.wieght = wieght;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Sweet(String name, double wieght, double price, int count) {
        this.name = name;
        this.wieght = wieght;
        this.price = price;
        this.count = count;
    }
}
