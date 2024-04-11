package com.javabasic;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int x=10, y=13, z=24;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i=0;i<arr.length;i++){
            System.out.println("Введите " + (i+1) + "-ый элемент массива: ");
            arr[i]=scanner.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            if ((arr[i]==x) || (arr[i]==y) || (arr[i]==z)){
                System.out.println("Данное значение имеется в константах: " + arr[i]);
            }
        }
    }
}
