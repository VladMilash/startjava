package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(String playerName1, String playerName2) {
        this.player1 = new Player(playerName1);
        this.player2 = new Player(playerName2);
    }

    public void play() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNum = (random.nextInt(101) + 1);
        int playerNum = 0;
        player1.cleanPlayerNums(player1.getPlayerNums(), player1.getAttempts());
        player2.cleanPlayerNums(player2.getPlayerNums(), player2.getAttempts());
        player1.resetAtattempts();
        player2.resetAtattempts();

        Player currentPlayer = player2;
        System.out.println("Игра началась! У каждого игрока есть по 10 попыток!");

        while (true) {
            if (currentPlayer == player2) {
                currentPlayer = player1;
            } else {
                currentPlayer = player2;
            }
            System.out.println("Игрок " + currentPlayer.getName() + " у вас осталось: "
                    + currentPlayer.getAttempts() + " попыток, ведите число:");
            playerNum = scanner.nextInt();
            currentPlayer.addNumberToPlayerArray(playerNum);
            if (playerNum == secretNum) {
                System.out.println("Игрок " + currentPlayer.getName() + " угадал с "
                        + currentPlayer.getAttemptsMade() + " попытки");
                break;
            } else if (playerNum > secretNum) {
                System.out.println("Ваше число больше того, которое загадал компьютер");
            } else if (playerNum < secretNum) {
                System.out.println("Ваше число меньше того, которое загадал компьютер");
            }

            currentPlayer.decrementAttempts();

            if (player1.getAttempts() == 0) {
                System.out.println("У игрока: " + player1.getName() + " закончились попытки");
            } else if (player2.getAttempts() == 0) {
                System.out.println("У игрока: " + player2.getName() + " закончились попытки");
            }
            if (player1.getAttempts() == 0 && player2.getAttempts() == 0) {
                System.out.println("У обоих игроков закончились попытки!");
                break;
            }
        }
        System.out.println("Игроки вводили такие числа: ");
        System.out.println(player1.getName() + ": " +
                Arrays.toString(player1.getImputPlayerNums(player1.getPlayerNums(), player1.getAttemptsMade())));
        System.out.println(player2.getName() + ": " +
                Arrays.toString(player2.getImputPlayerNums(player2.getPlayerNums(), player2.getAttemptsMade())));

        player1.cleanPlayerNums(player1.getPlayerNums(), player1.getAttempts());
        player2.cleanPlayerNums(player2.getPlayerNums(), player2.getAttempts());
    }
}