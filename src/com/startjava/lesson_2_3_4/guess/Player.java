package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int attempts;
    private int[] nums;

    public Player(String name) {
        this.name = name;
        this.nums = new int[10];
    }

    public String getName() {
        return name;
    }

    public int getAttempts() {
        return attempts;
    }

    public void addNum(int number) {
        nums[attempts] = number;
        attempts++;
    }

    public int[] getEnteredNums() {
        return Arrays.copyOf(nums, attempts);
    }

    public void clear() {
        Arrays.fill(nums, 0, attempts, 0);
        attempts = 0;
    }
}

