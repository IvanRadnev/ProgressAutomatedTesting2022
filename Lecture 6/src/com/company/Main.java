package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Computer pc = new Computer();

        System.out.println(pc.turnOn());
        System.out.println(pc.turnOff());

        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        System.out.println(dice1.Dice1() + dice2.Dice1());

        Coin coin = new Coin();
        System.out.println(coin.flip());
    }
}
