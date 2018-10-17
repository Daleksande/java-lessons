package com.company.present2;

import java.util.List;

public class Price {
    public static double getPrice (List<Sweet> present) {

        double presentCost = 0;

        for (int i = 0; i < present.size(); i++) {
            int sweetCount = Integer.parseInt(String.valueOf(present.get(i).getCount()));
            double sweetCost = Double.parseDouble(String.valueOf(present.get(i).getPrice()));
            presentCost = presentCost + sweetCost * sweetCount;
        }

        return  presentCost;

    }
}
