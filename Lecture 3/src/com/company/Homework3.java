package com.company;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many Fibonacci sequence numbers to display: ");
        int inputNum = input.nextInt();
        input.close();

        int firstTerm = 0;
        int secondTerm = 1;
        System.out.println("Fibonacci Series till " + inputNum + " terms:");

        for (int i = 1; i <= inputNum; ++i) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
