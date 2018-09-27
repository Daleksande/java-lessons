package com.company.present;

public class Candy {

    private String name;
    private double wieght;
    private double price;


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


    public Candy(String name, double wieght, double price) {
        this.name = name;
        this.wieght = wieght;
        this.price = price;
    }

}