package com.company;

import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Getting input from the user
        System.out.println("Make a move! (rock/paper/scissors)");
        String input = scanner.nextLine();

        int playerMove;
        if (input.equals("rock")) {
            playerMove = 0;
        } else if (input.equals("paper")) {
            playerMove = 1;
        } else {
            playerMove = 2;
        }

        // Getting input from the computer
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        String computerMove;
        if (randomNumber == 0) {
            computerMove = "rock";
        } else if (randomNumber == 1) {
            computerMove = "paper";
        } else {
            computerMove = "scissors";
        }
        System.out.println("Computer chose " + computerMove + "!");

        // Print results
        if (playerMove == randomNumber) {
            System.out.println("It's a draw!");
        } else if (playerMove > randomNumber && randomNumber != 0) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}