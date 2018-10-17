package com.company.present2;

import com.sun.istack.internal.Nullable;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        List<Sweet> present = new ArrayList<Sweet>();

        present.add(new Choco(0));
        present.add(new Drops(0));
        present.add(new Gum(0));

        Scanner in = new Scanner(System.in);

        System.out.println("Сколько вы готовы потратить?");
        int cash = Integer.parseInt(in.next());

        for (int i = 0; i < present.size(); i++) {
            String sweetName = present.get(i).getName();
            String sweetField = null;

            //доступ к спец полю по аннотации
            for (Field field : present.get(i).getClass().getDeclaredFields()) {
                if (field.getAnnotation(UnField.class) != null) {
                    field.setAccessible(true);
                    sweetField = field.get(present.get(i)).toString();
                    break;
                }
            }

            System.out.println("Сколько будет " + sweetName + " / " + sweetField + " в подарке?");

            Boolean flag = false;

            while (flag == false) {
                try {
                    int number = Integer.parseInt(in.next());

                    if (number == 0) { //если 0 то удаляем конфету
                        present.remove(i);
                        i = i-1;
                    } else {
                        Sweet sweet = present.get(i).getClass().getConstructor(int.class).newInstance(number);
                        present.set(i, sweet);
                    }

                    flag = true;
                } catch (NumberFormatException ex) {
                    System.out.println("Введена не цифра / " + ex + " /");
                    System.out.println("Сколько будет " + sweetName + " в подарке?");
                }
            }

        }

        Content.getContent(present);

        double presentCost = Price.getPrice(present);
        double presentWeight = Weight.getWeight(present);

        //изменяем состав подарка - start
        while (presentCost > cash) {

            presentCost = Price.getPrice(present);
            presentWeight = Weight.getWeight(present);

            System.out.println("Слишком дорогой подарок. Введите название конфеты и отредактируйте кол-во.");

            Content.getContent(present);

            String changedSweetName = String.valueOf(in.next());

            Iterator<Sweet> sweetIterator = present.iterator();

            while(sweetIterator.hasNext()) {
                Sweet nextSweet = sweetIterator.next();

                if (nextSweet.getName().equals(changedSweetName)) {
                    int changedSweetCount = nextSweet.getCount();
                    Boolean flag = false;
                    while (!flag) {
                        try {
                            System.out.println("Текущее кол-во " + changedSweetCount + " шт. Укажите новое кол-во:");
                            int number = Integer.parseInt(in.next());
                            if (number >= changedSweetCount) {
                                System.out.println("Новое количество не может быть больше или равно текущему!");
                                break;
                            } if (number == 0) {
                                sweetIterator.remove();
                                break;
                            } else {
                                nextSweet.setCount(number);

                                flag = true;
                            }
                        } catch (NumberFormatException ex) {
                            System.out.println("Введена не цифра / " + ex + " /");
                        }
                    }

                }
            }
        }
        //изменяем состав подарка - end

        System.out.println("Общий вес подарка:" + presentWeight);
        System.out.println("Общая стоимость подарка:" + presentCost);

    }
}

