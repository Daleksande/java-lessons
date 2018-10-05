package com.company.Generics;

import java.util.Arrays;

public class Main {

    public static <E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static <E> void maxValue(E[] elements) {
        Arrays.sort(elements);
        printArray(elements);
        System.out.println(elements[elements.length - 1]);
    }

    public static void maxLength (String[] strArray) {
        int max=strArray[0].length();
        int maxi=0;

        for (int i=0; i<strArray.length; i++){
            if (strArray[i].length()>max){
                max=strArray[i].length();
                maxi=i;
            }
        }

        System.out.println("Самое большое слово в массиве это " + strArray[maxi]+ " Оно состоит из " + max + " букв");
    }

    public static void main (String args[]) {
        Integer[] intArray = {10,20,30,40,50};
        String[] strArray = {"ZXololo", "rololoOfddd", "yL"};
        Double[] dblArray = {0.1, 0.05, 3.5};

        System.out.println("Printing Integer Array");
        printArray(intArray);

        System.out.println("Printing Character Array");
        printArray(strArray);

        System.out.println("Printing Double Array");
        printArray(dblArray);

        System.out.println("Printing maxValue for Integer Array");
        maxValue(intArray);

        System.out.println("Printing maxValue for Double Array");
        maxValue(dblArray);

        //ради интереса сделал поиск самого длинного слова в массиве
        //пришел к выводу, что использовать maxValue для этого - невозможно
        //т.е. и находить максимальное число и максимальное кол-во символов, в зависимости от типа данных,
        // и создал maxLength
        System.out.println("Printing max char value for String Array");
        maxLength(strArray);

    }
}
