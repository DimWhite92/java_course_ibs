package com.javabasic;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое положительное целое число: ");
        int n = scanner.nextInt();
        if (n>0){
            int sum = 0;
            for (int i=1;i<=n;i++){
                if (i%2!=0){
                    sum+=i;
                }
            }
            System.out.println("Сумма нечетных чисел от 1 до " + n + ": " + sum);
        } else {
            System.out.println(n + " не положительное целое число");
        }
    }
}
