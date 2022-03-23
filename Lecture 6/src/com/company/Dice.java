package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    public int Dice1(){

        return ThreadLocalRandom.current().nextInt(1, 6 + 1);
    }
}
