package com.company.present;

public class Candy {

    private String type;
    private String name;
    private double wieght;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Candy(String type, String name, double wieght, double price) {
        this.type = type;
        this.name = name;
        this.wieght = wieght;
        this.price = price;
}

}