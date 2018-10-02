package com.company.present;

class Gum extends Candy {
    private String taste;

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public Gum(String type, String name, double wieght, double price, String taste) {
        super(type, name, wieght, price);
        this.taste = taste;
    }
}