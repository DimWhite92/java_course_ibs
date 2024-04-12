package com.javabasic;

public class Task12 {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        boolean flag = true;
        System.out.print("Начальная строка: " + str + "\n");
        System.out.print("Проверить, содержит ли строка подстроку “Java”: ");
        if (!str.contains("Java")) {
            flag = false;
        }
        System.out.println(str.contains("Java"));
        System.out.print("Проверить, начинается ли строка с подстроки “I like”: ");
        if (!str.startsWith("I like")) {
            flag = false;
        }
        System.out.println(str.startsWith("I like"));
        System.out.print("Проверить, заканчивается ли строка с подстроки “!!!”: ");
        if (!str.endsWith("!!!")) {
            flag = false;
        }
        System.out.println(str.endsWith("!!!"));
        System.out.print("Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру: ");
        if (flag) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println("Какое-то из условий не верно");
        }
        System.out.print("Замените все символы ‘a’ на ‘о’ и выведите подстроку “Jovo” на экран: ");
        System.out.println(str.replace('a','o').substring(7,11));
    }
}
