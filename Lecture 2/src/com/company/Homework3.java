package com.company;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a day:");
        int day = input.nextInt();

        System.out.println("Enter a month:");
        int month = input.nextInt();

        System.out.println("Enter a year:");
        int year = input.nextInt();

        input.close();

        if (day <=0 || day > 31){
            System.out.println("The day must be between 1 and 31");
        } else if (month <= 0 || month > 12){
            System.out.println("The month must be between 1 and 12");
        } else if (year <= 0){
            System.out.println("The year must be more than 0");
        } else {
            if (day <= 30 && (month == 4 || month == 6 || month == 9 || month == 11)){
                System.out.println("Valid date");
            } else if (day <= 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)){
                System.out.println("Valid date");
            } else if (day <= 29 && month == 2 && ((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)){
                System.out.println("Valid date");
            } else if (day < 29 && month == 2){
                System.out.println("Valid date");
            } else {
                System.out.println("Not a valid date");
            }
        }
    }
}
