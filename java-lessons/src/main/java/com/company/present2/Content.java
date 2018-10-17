package com.company.present2;

import java.util.ArrayList;
import java.util.List;

public class Content {

    public static void getContent (List<Sweet> present) {
        System.out.println("Состав подарка отсортированный по алфавиту:");
        List<String> sweetNames = new ArrayList<>();
        present.stream().filter(sweet -> sweet.getCount() > 0).forEach(sweet -> sweetNames.add(sweet.getName() + ": " + sweet.getCount() + " шт"));
        sweetNames.stream().sorted().forEach(System.out::println);
    }
}
