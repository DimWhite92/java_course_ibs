package com.javabasic;

import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
        float fx = 1;
        float rub = 0;
        float usd = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Курс доллара: ");
        fx = scanner.nextFloat();
        System.out.println("Кол-во рублей: ");
        rub = scanner.nextFloat();
        usd = rub/fx;
        System.out.printf("Итого:  %.2f долларов", usd);
    }
}
