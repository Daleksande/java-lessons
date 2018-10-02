package com.company.calc;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    //складывает 2 числа
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
        scanner.close();
	// write your code here
    }
}
