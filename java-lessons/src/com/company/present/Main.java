package com.company.present;

import com.company.calc2.Operacionist;

public class Main {
    public static void main(String[] args) {
        Chocolate twx = new Chocolate("Twix", 125, 50, "white");
        Chocolate mrs = new Chocolate("Mars", 200, 70, "black");
        Drops chp = new Drops("Chupa-Chups", 10, 25, "red");
        Gum orb = new Gum("Orbit", 5, 25, "mentol");

        double presentPrice = twx.getPrice() + mrs.getPrice() + chp.getPrice() + orb.getPrice();
        double presentWeight = twx.getWieght() + mrs.getWieght() + chp.getWieght() + orb.getWieght();

        System.out.println("Подарок весом "
            + presentWeight
            + " и стоимостью "
            + presentPrice
            + " состоит из "
            + twx.getName() + ", " + mrs.getName() + ", " + chp.getName() + ", " + orb.getName()
        );
    }
}
