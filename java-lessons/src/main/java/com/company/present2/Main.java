package com.company.present2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

//        Sweet sweet = new Choco("test", 10, 10.10, 1, "red");
        Sweet sweet = new Gum("test", 10, 10, 1, "sweet");

        for (Field field : sweet.getClass().getDeclaredFields()) {
            if (field.getAnnotation(UnField.class) != null) {
                field.setAccessible(true);
                System.out.println(field.get(sweet).toString());
                break;
            }
        }
    }
}
//
//        List<Sweet> present = new ArrayList<Sweet>();
//
//        present.add(new Choco(0));
//        present.add(new Drops(0));
//        present.add(new Gum(0));
//
//        Scanner in = new Scanner(System.in);
//
//        for (int i = 0; i < present.size(); i++) {
//            String sweetName = present.get(i).getName();
//            System.out.println("Сколько будет " + sweetName + " в подарке?");
//
//            Boolean flag = false;
//
//            while (flag == false) {
//                try {
//                    int number = Integer.parseInt(in.next());
//                    Sweet sweet = present.get(i).getClass().getConstructor(int.class).newInstance(number);
//                    present.set(i, sweet);
//                    flag = true;
//                } catch (NumberFormatException ex) {
//                    System.out.println("Введена не цифра / " + ex + " /");
//                    System.out.println("Сколько будет " + sweetName + " в подарке?");
//                }
//            }
//
//        }
//
//        System.out.println("Состав подарка отсортированный по алфавиту:");
//        List<String> sweetNames = new ArrayList<>();
//        present.stream().filter(sweet -> sweet.getCount() > 0).forEach(sweet -> sweetNames.add(sweet.getName()));
//        sweetNames.stream().sorted().forEach(System.out::println);
//
//
//        double presentWeight = 0;
//        double presentCost = 0;
//
////        System.out.println("Состав подарка:");
//
//        for (int i = 0; i < present.size(); i++) {
//            int sweetCount = present.get(i).getCount();
//
//            if (sweetCount > 0) {
////                String sweetName = present.get(i).getName();
////                System.out.println(sweetName);
//
//                double sweetWeight = Double.parseDouble(String.valueOf(present.get(i).getWieght()));
//                presentWeight = presentWeight + sweetWeight * sweetCount;
//
//                double sweetCost = Double.parseDouble(String.valueOf(present.get(i).getPrice()));
//                presentCost = presentCost + sweetCost * sweetCount;
//            }
//        }
//
//        if (presentWeight > 0) {
//            System.out.println("Общий вес подарка:" + presentWeight);
//            System.out.println("Общая стоимость подарка:" + presentCost);
//        } else {
//            System.out.println("Подарок пуст :(");
//        }
//

