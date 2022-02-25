package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Hemowork4 {
    public static void main(String[] args) {

        int randomNum = ThreadLocalRandom.current().nextInt(1, 100 + 1);

        System.out.println("The number is " + randomNum);

        if (randomNum % 2 == 0){
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
