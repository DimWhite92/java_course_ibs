package com.javabasic;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        String num1;
        int num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        num1 = scanner.nextLine();
        System.out.println("Введите второе число: ");
        num2 = scanner.nextInt();
        int num3 = Integer.parseInt(num1);
        if (num3 > num2) {
            System.out.println("Большее число: " + num3);
            System.out.println("Меньшее число: " + (double)num2);
        } else
        if (num3 < num2) {
            System.out.println("Большее число: " + num2);
            System.out.println("Меньшее число: " + (double)num3);
        } else {
            System.out.println("Числа равны");
        }
    }
}
