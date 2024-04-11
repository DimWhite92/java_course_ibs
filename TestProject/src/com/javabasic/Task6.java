package com.javabasic;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1-масса, 2-расстояние");
        int subj = scanner.nextInt();
        int ed = 1;
        float value = 0;
        if (subj == 2){
            System.out.println("Выберите единицу измерения: 1-метр(default), 2-миля, 3-ярд, 4-фунт");
            ed = scanner.nextInt();
            System.out.println("Введите число: ");
            value = scanner.nextFloat();
            float m = value;
            switch (ed) {
                case 2:
                    m = value/0.00062137f;
                    break;
                case 3:
                    m = value/1.0936f;
                    break;
                case 4:
                    m = value/3.2808f;
                    break;
            }
            System.out.println("Результат:");
            System.out.print("Метры: " + m + "\nМили: " + m*0.00062137f + "\nЯрды: " + m*1.0936f + "\nФуты: " + m*3.2808f);
        } else
        if (subj == 1){
            System.out.println("Выберите единицу измерения: 1-грамм, 2-кг(default), 3-тонна");
            ed = scanner.nextInt();
            System.out.println("Введите число: ");
            value = scanner.nextFloat();
            float kg = value;
            switch (ed) {
                case 1:
                    kg = value/1000f;
                    break;
                case 3:
                    kg = value*1000f;
                    break;
            }
            System.out.println("Результат:");
            System.out.print("Граммы: " + kg*1000 + "\nКилограммы: " + kg + "\nТонны: " + kg/1000);
        } else {
            System.out.println("Вы ничего не выбрали, либо выбрали неверно");
        }
    }
}
