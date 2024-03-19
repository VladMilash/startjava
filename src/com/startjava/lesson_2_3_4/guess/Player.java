package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int attempts;
    private int[] nums;

    public Player(String name) {
        this.name = name;
        this.nums = new int[10];
        this.attempts = 0;
    }

    public String getName() {
        return name;
    }

    public int getAttempts() {
        return attempts;
    }

    public void addNums(int number) {
        nums[attempts] = number;
    }

    public void incrementAttempts() {
        attempts++;
    }

    public int[] getImputNums(int attempts) {
        int[] getImputNums = Arrays.copyOf(nums, attempts);
        return getImputNums;
    }

    public void cleanNums() {
        Arrays.fill(nums, 0, attempts, 0);
        attempts = 0;
    }
}

