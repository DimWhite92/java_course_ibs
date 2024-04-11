package com.javabasic;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        float num1 = scanner.nextFloat();
        System.out.println("Введите второе число: ");
        float num2 = scanner.nextFloat();
        System.out.println("Введите знак арифметической операции: ");
        String op = scanner.nextLine();
        op = scanner.nextLine();
        float res = 0;
        switch (op) {
            case "+":
                res = num1 + num2;
                System.out.println(num1 + op + num2 + "=" + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println(num1 + op + num2 + "=" + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println(num1 + op + num2 + "=" + res);
                break;
            case "/":
                if (num2 != 0) {
                    res = num1 / num2;
                    System.out.println(num1 + op + num2 + "=" + res);
                } else {
                    System.out.println("Делить на 0 нельзя!");
                }
                break;
            default:
                System.out.println("Некорректная операция: " + op);
        }
    }
}
