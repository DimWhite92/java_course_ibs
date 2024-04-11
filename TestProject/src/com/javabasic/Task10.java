package com.javabasic;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        System.out.println("Введите число строк в матрице: ");
        n = scanner.nextInt();
        System.out.println("Введите число столбцов в матрице: ");
        m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.println("Введите " + (j+1) + "-ый элемент " + (i+1) + "-ой строки");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Первая строка, умноженная на 3: [");
        for (int j=0; j<m; j++) {
            if (j==m-1) {
                System.out.print(arr[0][j]*3 + "]\n");
            } else {
                System.out.print(arr[0][j]*3 + ",");
            }
        }
    }
}
