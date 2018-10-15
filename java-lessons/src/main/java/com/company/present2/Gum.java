package com.company.present2;

public class Gum extends Sweet {
    private String flavor;

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Gum(String name, double wieght, double price, int count, String flavor) {
        super(name, wieght, price, count);
        this.flavor = flavor;
    }

    public Gum(int count) {
        super("Bubaluya", 0.5, 1, count);
        flavor = "cherry";
    }

}
