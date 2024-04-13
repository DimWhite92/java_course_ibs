package com.javabasic;

import java.util.Scanner;

public class FinalTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        boolean helpFlag = false;
        String corAnswer = "Заархивированный вирус";
        System.out.println("Отгадай загадку");
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        for (int i=1; i<=3; i++) {
            System.out.println("Попытка " + i + ": ");
            answer = scanner.nextLine();
            if (i==1 & answer.equals("Подсказка")) {
                helpFlag = true;
                System.out.println("Это Заарх*в*рованный в*рус");
                System.out.println("Попытка " + i + ": ");
                answer = scanner.nextLine();
            } else
            if (answer.equals("Подсказка")) {
                System.out.println("Подсказка уже недоступна");
                System.out.println("Попытка " + i + ": ");
                answer = scanner.nextLine();
            }
            if (answer.equals(corAnswer)) {
                System.out.println("Правильно!");
                break;
            } else {
                if (i!=3 & !helpFlag) {
                    System.out.println("Подумай еще!");
                    continue;
                } else {
                    System.out.println("Обидно, приходи в другой раз");
                    if (helpFlag) {
                        break;
                    }
                }
            }
        }
    }
}
