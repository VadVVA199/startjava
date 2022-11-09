package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers;
    private int attempt;

    private int minDifferenceHiddenNumber;

    public Player(String name) {
        this.name = name;
        this.numbers = new int[10];
    }

    public String getName() {
        return name;
    }

     public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public void addNumber(int number) {
        if (number > 0 && number <= 100) {
            numbers[attempt - 1] = number;
        } else {
            throw new IllegalArgumentException("Ошибка, число не в заданном диапазоне");
        }
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt += attempt;
    }

    public void clearAttempts() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }

    public int getMinDifferenceHiddenNumber() {
        return minDifferenceHiddenNumber;
    }

    public void setMinDifferenceHiddenNumber(int minDifferenceHiddenNumber) {
        this.minDifferenceHiddenNumber = minDifferenceHiddenNumber;
    }

}