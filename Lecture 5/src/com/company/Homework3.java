package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        System.out.println(threeElements());
    }

    public static String threeElements(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three elements:");

        String arr[] = new String[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.next();
        }
        return Arrays.toString(arr);
    }
}
