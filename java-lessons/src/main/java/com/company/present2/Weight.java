package com.company.present2;

import java.util.List;

public class Weight {

    public static double getWeight (List<Sweet> present) {

        double presentWeight = 0;

        for (int i = 0; i < present.size(); i++) {
            int sweetCount = Integer.parseInt(String.valueOf(present.get(i).getCount()));
            double sweetWeight = Double.parseDouble(String.valueOf(present.get(i).getWieght()));
            presentWeight = presentWeight + sweetWeight * sweetCount;
        }

        return  presentWeight;

    }
}
