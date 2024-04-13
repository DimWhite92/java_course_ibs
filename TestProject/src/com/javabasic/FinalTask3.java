package com.javabasic;

import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);// если использовать только один сканер, то первая строка каким-то образом сама считывается как пустая
        System.out.println("Введите кол-во строк: ");
        int n = scanner1.nextInt();
        String[] str = new String[n];
        int[] strLength = new int[n];
        for (int i=0; i<n; i++) {
            System.out.println("Введите строку " + (i+1) + ": ");
            str[i]=scanner2.nextLine();
            char[] chr = str[i].toCharArray();
            String newStr = "";
            for (int j=0; j<chr.length; j++) {
                if (!newStr.contains(Character.toString(chr[j]))) {
                    newStr = newStr + chr[j];
                }
            }
            strLength[i]=newStr.length();
        }
        int maxInd=n-1;
        int maxLength=strLength[n-1];
        for (int i=n-1; i>=0; i--) {
            if (strLength[i]>=maxLength) {
                maxLength=strLength[i];
                maxInd=i;
            }
            //System.out.println("Кол-во различных символов в строке " + (i+1) + ": " + strLength[i]);
        }
        System.out.println("Строка с максимальным кол-вом различных символов - строка" + (maxInd+1) + ": ");
        System.out.println(str[maxInd]);
    }
}