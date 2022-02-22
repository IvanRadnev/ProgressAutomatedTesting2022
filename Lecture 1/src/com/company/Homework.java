package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Homework {

    public static void main(String[] args) {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);

        System.out.println("Generated number is: " + randomNum);

        if (randomNum > 5){
            System.out.println("The number is greater than 5.");
        }

    }
}
