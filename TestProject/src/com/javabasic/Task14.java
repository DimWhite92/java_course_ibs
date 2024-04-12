package com.javabasic;

import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        Random random = new Random();
        int maximum = 20, minimum = -20;
        int[] arr = new int[15];
        System.out.println("Массив из 15 рандомных целых чисел из диапозона [-20;20]: ");
        for (int i=0; i<15; i++) {
            arr[i]=random.nextInt(maximum - minimum + 1) + minimum;
            System.out.print(arr[i] + " ");
        }
        int max, min;
        max=min=arr[0];
        for (int i=0; i<15; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
            if (arr[i]<min) {
                min=arr[i];
            }
        }
        System.out.println("\nMax: " + max + "\nMin: " + min);
        System.out.print("Из максимального и минимального значения выведите наибольшее по модулю: ");
        System.out.println(Math.max(Math.abs(min),Math.abs(max)));
    }
}
