package com.company;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        int num;

        System.out.println("Enter a number:");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        scan.close();

        //The easy way, with "Math" class.
        System.out.println("Absolute Value of the number is: " + Math.abs(num));

        //With if statement.
        if (num < 0){
            System.out.println("Absolute Value of the number is: " + num * -1);
        } else {
            System.out.println("Absolute Value of the number is: " + num);
        }
    }
}
