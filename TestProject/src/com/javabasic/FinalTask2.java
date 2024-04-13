package com.javabasic;

import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите простое уравнение относительно x");
        System.out.print("Ввод: ");
        String str = scanner.nextLine();
        char[] res = str.toCharArray();
        if (res[4]=='x') {
            String sl2 = "" + res[1] + res[2];
            System.out.println("x=" + (Character.getNumericValue(res[0])+Integer.parseInt(sl2)));
        } else
        if (res[0]=='x') {
            String sl2 = "" + res[1] + res[2];
            System.out.println("x=" + (Character.getNumericValue(res[4])-Integer.parseInt(sl2)));
        } else
        if (res[2]=='x') {
            int x = Character.getNumericValue(res[4])-Character.getNumericValue(res[0]);
            x = x*Integer.parseInt(res[1]+"1");
            System.out.println("x=" + x);
        }
    }
}
