package com.company;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number of classes held:");
        int classesHeld = input.nextInt();

        System.out.println("Enter a number of classes attended:");
        int classesAttended = input.nextInt();

        input.close();

        int percentageOfClassAttended = (classesAttended * 100) / classesHeld;

        if (percentageOfClassAttended >= 75){
            System.out.println(percentageOfClassAttended + "%\nYou are able to attend.");
        } else {
            System.out.println(percentageOfClassAttended + "%\nYou are not able to attend.");
        }
    }
}