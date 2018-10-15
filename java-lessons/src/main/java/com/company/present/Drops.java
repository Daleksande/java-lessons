package com.company.present;

class Drops extends Candy {
    private String form;

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public Drops(String name, double wieght, double price, String form) {
        super(name, wieght, price);
        this.form = form;
    }
}