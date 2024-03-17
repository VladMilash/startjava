package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя первого игрока: ");
        String playerName1 = scanner.next();

        System.out.println("Введите имя второго игрока: ");
        String playerName2 = scanner.next();

        GuessNumber game = new GuessNumber(playerName1, playerName2);

        String choice = "yes";

        do {
            if (choice.equals("yes")) {
                game.play();
            }
            System.out.println("Еще сыграть? [yes/no]:");
            choice = scanner.nextLine();
        } while (!choice.equals("no"));
        System.out.println("Игра завершена. Всего доброго!");
    }
}