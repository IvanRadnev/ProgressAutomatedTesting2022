package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        // Ex. 1
        System.out.println("Ex. 1");
        int randomNum = ThreadLocalRandom.current().nextInt(-100, 100 + 1);
        System.out.println("The number is " + randomNum);

        if(randomNum < 0){
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is positive");
        }

        //Ex.2
        System.out.println("Ex. 2");
        String number = randomNum < 0 ? "The number is negative" : "The number is positive";
        System.out.println(number);

        //Ex.3
        System.out.println("Ex. 3");

        int num;
        System.out.println("Enter a number:");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        scan.close();

        if (num == 2){
            System.out.println("Entered number is 2");
        } else if (num == 3){
            System.out.println("Entered number is 3");
        } else if (num == 4){
            System.out.println("Entered number is 4");
        } else if (num == 5){
            System.out.println("Entered number is 5");
        } else if (num == 6){
            System.out.println("Entered number is 6");
        } else {
            System.out.println("The number must be between 2 and 6.");
        }

    }
}
