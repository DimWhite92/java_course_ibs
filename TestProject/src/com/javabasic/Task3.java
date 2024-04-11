package com.javabasic;

public class Task3 {
    public static void main(String[] args) {
        int[] mas = new int[] {12,23,42,27,35};
        System.out.print("Before: [");
        for (int i=0; i<mas.length; i++){
            System.out.print(mas[i]);
            if (i != mas.length-1){
                System.out.print(", ");
            } else {
                System.out.println("]\n");
            }
        }
        int temp = mas[0];
        mas[0] = mas[mas.length-1];
        mas[mas.length-1] = temp;
        System.out.print("After replacement: [");
        for (int i=0; i<mas.length; i++){
            System.out.print(mas[i]);
            if (i != mas.length-1){
                System.out.print(", ");
            } else {
                System.out.println("]\n");
            }
        }
        int sum = mas[0] + mas[mas.length/2];
        System.out.println("Sum: " + mas[0] + " + " + mas[mas.length/2] + " = " + sum);
    }
}
