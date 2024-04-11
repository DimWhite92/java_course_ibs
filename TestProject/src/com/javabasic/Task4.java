package com.javabasic;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число x: ");
        float x = scanner.nextFloat();
        System.out.println("Введите число y: ");
        float y = scanner.nextFloat();
        System.out.println("Введите число z: ");
        float z = scanner.nextFloat();
        float med = (x+y+z)/3;
        System.out.println("Среднее арифметическое чисел " + x + ", " + y + ", " + z + " равно " + med);
        double med2 = Math.floor(med);
        if (med2>3){
            System.out.println("Программа выполнена корректно");
        }
    }
}
