package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int attempts;

    private int attemptsMade;

    private int[] playerNums;

    public Player(String name) {
        this.name = name;
        this.playerNums = new int[10];
        this.attempts = 10;
        this.attemptsMade = 0;
    }

    public String getName() {
        return name;
    }

    public int getAttempts() {
        return attempts;
    }

    public int getAttemptsMade() {
        return attemptsMade;
    }

    public int[] getPlayerNums() {
        return playerNums;
    }

    public void addNumberToPlayerArray(int number) {
        playerNums[playerNums.length - attempts] = number;
        attemptsMade++;
    }

    public void decrementAttempts() {
        attempts--;
    }

    public int[] getImputPlayerNums(int[] playerNameNums, int attemptsMade) {
        int[] inputPlayerNums = Arrays.copyOf(playerNameNums, attemptsMade);
        return inputPlayerNums;
    }

    public int[] cleanPlayerNums(int[] playerNameNums, int attemptsMade) {
        Arrays.fill(playerNameNums, 0, attemptsMade, 0);
        return playerNameNums;
    }

    public void resetAtattempts() {
        attempts = 10;
        attemptsMade = 0;
    }
}

