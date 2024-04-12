package com.javabasic;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        str = scanner.nextLine();
        //str = "I love java 8 Я люблю java 14 core1";
        String strNew = str.replaceAll("[^a-zA-Z ]","");
        String[] res = strNew.split(" +");
        System.out.println("Выведите слова, состоящие только из латиницы: ");
        for (String w : res) {
            System.out.print(w + " ");
        }
        System.out.println("\nВыведите количество этих слов: " + res.length);
    }
}
