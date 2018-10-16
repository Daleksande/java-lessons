package com.company.present2;

public class Drops extends Sweet {

    @UnField
    private String form;

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public Drops(String name, double wieght, double price, int count, String form) {
        super(name, wieght, price, count);
        this.form = form;
    }

    public Drops(int count) {
        super("Chupa", 1, 20, count);
        form = "ball";
    }

}
