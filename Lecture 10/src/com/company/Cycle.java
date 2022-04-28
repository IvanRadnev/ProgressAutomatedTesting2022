package com.company;

public class Cycle implements Movement{


    @Override
    public String moveForward() {
        return "Move Forward is hard.";
    }

    @Override
    public String moveBackward() {
        return "Move Backward is impossible!";
    }
}
