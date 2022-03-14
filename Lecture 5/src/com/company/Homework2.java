package com.company;

import java.util.Arrays;
import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {

        System.out.println(randomNum());
    }

    public static String randomNum() {
        Random r = new Random();
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt((10 - 1) + 1) + 1;

        }
        return Arrays.toString(arr);
    }

}
