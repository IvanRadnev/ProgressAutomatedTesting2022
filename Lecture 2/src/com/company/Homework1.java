package com.company;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        int num;

        System.out.println("Enter a number:");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        scan.close();

        System.out.println("Absolute Value of the number is: " + Math.abs(num));
    }
}
