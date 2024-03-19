package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();

        System.out.println("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();

        GuessNumber game = new GuessNumber(name1, name2);
        String choice = "yes";

        do {
            if (choice.equals("yes")) {
                game.play();
            }
            System.out.println("\nЕще играем? [yes/no]:");
            choice = scanner.nextLine();
        } while (!choice.equals("no"));
        System.out.println("Игра завершена. Всего доброго!");
    }
}