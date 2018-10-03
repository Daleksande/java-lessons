package com.company.present;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Candy[] candys = {new Drops("drops", "Chupa-Chups", 10, 25, "round"),
                new Chocolate("chokolate", "Chokolatko", 26, 1.05, "white"),
                new Gum("gum", "Bubbaluya", 1.5, 2.6, "cherry")
        };

        Map<String, Integer> present = new HashMap<>();

        double sumWeight = 0.0;
        double sumPrice = 0.0;
        int countAll = 0;

        System.out.println("Выберите номер сладости из списка:");
        for (int i = 0; i < candys.length; i++) {
            System.out.println(i + 1 + " - " + candys[i].getName());
        }

        Scanner in = new Scanner(System.in);

        Boolean flag = true;

        try {

            while (flag == true) {
                System.out.println("Выберите номер сладости из списка:");
                String a = in.next();
                System.out.println("Укажите количество конфет выбранного типа:");
                int b = Integer.parseInt(in.next());


                present.put(candys[Integer.parseInt(a) - 1].getName(), b);

//                if(!present.isEmpty() && String.valueOf(present.get(candys[Integer.parseInt(a) - 1].getName())) != null) {
//                    int n = present.get(candys[Integer.parseInt(a) - 1].getName()) + b;
//                    present.put(candys[Integer.parseInt(a) - 1].getName(), n);
//                } else {
//                    present.put(candys[Integer.parseInt(a) - 1].getName(), b);
//                }

                System.out.println("Продолжить формирование подарка? Y/N");
                while (true) {
                    String c = in.next();
                    if (c.equals("Y") || c.equals("y")) {
                        break;
                    }
                    if (c.equals("N") || c.equals("n")) {
                        flag = false;
                        break;
                    }
                    if (!c.equals("Y") || !c.equals("N")) {
                        System.out.println("Нужно ввести Y для продолжения формирования подарка, либо N для завершения работы.");
                        continue;
                    }
                }
            }

            System.out.println("\nСостав подарка:");
            for (Map.Entry item : present.entrySet()) {
                System.out.println("Конфета - " + item.getKey() + ", Количество - " + item.getValue());
                int countV = Integer.parseInt(item.getValue().toString());
                String name = item.getKey().toString();

                for (int i = 0; i < candys.length; i++) {
                    String result = "";
                    result = result + candys[i].getName();
                    if (result.equals(name)) {
                        sumWeight += countV * candys[i].getWieght();
                        sumPrice += countV* candys[i].getPrice();
                    }
                }

                countAll += Integer.parseInt(item.getValue().toString());
            }

            double sum = new BigDecimal(sumPrice).setScale(2, RoundingMode.UP).doubleValue();

            System.out.println("Всего конфет: " + countAll);
            System.out.println("Вес подарка: " + sumWeight);
            System.out.println("Цена подарка: " + sum);

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("\nВведено значение сладости, которой нет в списке!\n" + ex + "\n");
            System.out.println("Формирование подарка прекращено.");
        }

        //удаление
        while (sumWeight > 50) {
            System.out.println("\nВес подарка превышает 50. Надо что-то удалить. Введите название конфеты для удаления.");

            String d = in.next();

            present.remove(d);

           sumWeight = 0;
           sumPrice = 0;
           countAll = 0;

            System.out.println("\nСостав подарка:");
            for (Map.Entry item : present.entrySet()) {
                System.out.println("Конфета - " + item.getKey() + ", Количество - " + item.getValue());
                int countV = Integer.parseInt(item.getValue().toString());
                String name = item.getKey().toString();

                for (int i = 0; i < candys.length; i++) {
                    String result = "";
                    result = result + candys[i].getName();
                    if (result.equals(name)) {
                        sumWeight += countV * candys[i].getWieght();
                        sumPrice += countV* candys[i].getPrice();
                    }
                }

                countAll += Integer.parseInt(item.getValue().toString());
            }

            double sum = new BigDecimal(sumPrice).setScale(2, RoundingMode.UP).doubleValue();

            System.out.println("Всего конфет: " + countAll);
            System.out.println("Вес подарка: " + sumWeight);
            System.out.println("Цена подарка: " + sum);
        }

    }

}
