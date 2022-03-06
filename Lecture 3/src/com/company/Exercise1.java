package com.company;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        //Задача: елемент, равен на сумата на останалите
        //Да се напише програма, която въвежда n цели числа и проверява дали сред тях
        //съществува число, което е равно на сумата на всички останали. Ако има такъв
        //елемент, се отпечатва "Yes" + неговата стойност, в противен случай - "No" +
        //разликата между най-големия елемент и сумата на останалите (по абсолютна
        //стойност).

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers will you enter: ");
        int n = input.nextInt();

        int sum = 0;
        int maxNum = Integer.MIN_VALUE;

        System.out.println("Enter a numbers: ");
        for (int i = 1; i <= n; i++) {
            int numbers = input.nextInt();
            sum += numbers;

            if ( numbers > maxNum){
                maxNum = numbers;
            }
        }

        if (sum - maxNum == maxNum){
            System.out.println("Yes" + "\n" +
             "Sum = " + maxNum);
        } else {
            System.out.println("No"  + "\n" +
                    "Diff = " + Math.abs(maxNum - (sum - maxNum)));
        }
    }
}