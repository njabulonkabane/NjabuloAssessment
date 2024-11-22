package Helpers;

import utility.browserDriver;

import java.util.Random;

public class randomGenerator extends browserDriver {

    public static String generateRandomString(String identifier) {
        StringBuilder randomString = new StringBuilder(5);
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            char randomChar = (char) ('a' + rand.nextInt(26));
            randomString.append(randomChar);
        }
        return randomString.toString();
    }
    public static String generateRandomNumber(double length) {

        if (length <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        Random random = new Random();
        int lowerBound = (int) Math.pow(10, length - 1);

        int upperBound = (int) Math.pow(10, length) - 1;

        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        return String.valueOf(randomNumber);
    }
}