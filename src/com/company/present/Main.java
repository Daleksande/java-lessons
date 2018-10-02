package com.company.present;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Candy[] candy = {new Drops("drops", "Chupa-Chups", 10, 25, "round"),
                new Chocolate("chokolate", "chokolate", 0.76, 1.05, "white"),
                new Gum("gum", "gum", 1.5, 2.6, "qw")
        };

        Map<String, Integer> present = new HashMap<>();

        System.out.println("Начинаем формированеи подарка.");
        System.out.println("Выберите один из типов сладости (введите номер с клавиатуры): ");
        for (int i = 0; i < candy.length; i++) {
            System.out.println(i + 1 + " - " + candy[i].getName());
        }
        System.out.println();

        Scanner in = new Scanner(System.in);

        Boolean flag = true;

        while (flag == true) {
            System.out.println("Выберите следующий тип сладостей в ваш подарок: ");
            String a = in.next();
            System.out.println("Укажите количество конфет выбранного типа: ");
            int b = Integer.parseInt(in.next());


            present.put(a, b);
            System.out.println("Продолжить формирование подарка? Y/N");
            while(true) {
                String c = in.next();
                if (c.equals("Y") || c.equals("y")) {
                    break;
                }
                if (c.equals("N") || c.equals("n3")) {
                    flag = false;
                    break;
                }
                if (!c.equals("Y") || !c.equals("N")) {
                    System.out.println("Нужно ввести Y для продолжения формирования подарка, либо N для завершения работы.");
                    continue;
                }
            }
        }


//        for (Map.Entry item : present.entrySet()) {
//            System.out.println("Key - " + item.getKey() + ", Value - " + item.getValue());
//        }



//        present.put("ChupaChups", 1);
//
//        System.out.println(present.get(0));

//        ArrayList<Any> drops = new ArrayList<Any>();
//
//
////        drops.add();
//
//        Chocolate twx = new Chocolate("Twix", 125, 50, "white");
//        Chocolate mrs = new Chocolate("Mars", 200, 70, "black");
//        Drops chp = new Drops("Chupa-Chups", 10, 25, "red");
//        Gum orb = new Gum("Orbit", 5, 25, "mentol");
//
//        String[] a = new String[3];
//        Scanner in = new Scanner(System.in);
//
//        System.out.println(a[1]);

//        for (int i = 0; i < a.length; i++) {
//            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
//            a[i] = in.next();
//            System.out.println(a[i] + " - ");
//        }

//        {
//
//            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
//            a[i] = in.nextInt();
//
//            System.out.println(a[i] + " - ");
//
//            i++;
//        }

//        System.out.println(Arrays.toString(a));



//        double presentPrice = twx.getPrice() + mrs.getPrice() + chp.getPrice() + orb.getPrice();
//        double presentWeight = twx.getWieght() + mrs.getWieght() + chp.getWieght() + orb.getWieght();

//        System.out.println("Подарок весом "
//                + presentWeight
//                + " и стоимостью "
//                + presentPrice
//                + " состоит из "
//                + twx.getName() + ", " + mrs.getName() + ", " + chp.getName() + ", " + orb.getName()
//        );

    }

}
