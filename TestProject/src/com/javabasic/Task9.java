package com.javabasic;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int len = scanner.nextInt();
        double[] arr = new double[len];
        for (int i=0;i<arr.length;i++) {
            System.out.println("Введите " + (i+1) + "-ый элемент массива: ");
            arr[i]=scanner.nextDouble();
        }
        double med = 0;
        for (double elem : arr) {
            med += elem;
        }
        med/=arr.length;
        System.out.println("Среднее арифметическое элементов массива: " + med);
        System.out.print("Элементы массива умноженные на ср. арифметическое: [");
        for (int i=0; i<arr.length; i++) {
            if (i==arr.length-1) {
                System.out.print(arr[i]*med + "]\n");
            } else {
                System.out.print(arr[i]*med + ",");
            }
        }
    }
}
