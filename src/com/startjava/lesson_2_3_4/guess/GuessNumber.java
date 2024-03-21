package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(String name1, String name2) {
        this.player1 = new Player(name1);
        this.player2 = new Player(name2);
    }

    public void play() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNum = (random.nextInt(100) + 1);
        int playerNum = 0;
        player1.clear();
        player2.clear();

        Player currentPlayer = player2;
        System.out.println("Игра началась! У каждого игрока есть по 10 попыток!");

        while (true) {
            currentPlayer = (currentPlayer == player2) ? player1 : player2;
            System.out.println("Игрок " + currentPlayer.getName() + ", введите число:");
            playerNum = scanner.nextInt();
            currentPlayer.addNum(playerNum);
            if (playerNum == secretNum) {
                System.out.println("Игрок " + currentPlayer.getName() + " угадал с "
                        + currentPlayer.getAttempts() + " попытки");
                break;
            }
            if (playerNum > secretNum) {
                System.out.println("Ваше число больше того, которое загадал компьютер");
            } else {
                System.out.println("Ваше число меньше того, которое загадал компьютер");
            }

            checkAttempts(currentPlayer);
            if (player1.getAttempts() == 10 && player2.getAttempts() == 10) {
                System.out.println("У обоих игроков закончились попытки!");
                break;
            }
        }

        printNums(player1);
        printNums(player2);
    }

    public void checkAttempts(Player currentPlayer) {
        if (currentPlayer.getAttempts() == 10) {
            System.out.println("У игрока: " + currentPlayer.getName() + " закончились попытки");
        }
    }

    public void printNums(Player player) {
        System.out.print("Игрок " + player.getName() + " ввел следующие числа: ");
        for (int i : player.getEnteredNums()) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}