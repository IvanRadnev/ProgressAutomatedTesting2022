package com.company;

public class Rectangle {

    int a;
    int b;

    public Rectangle(int inputA, int inputB){
        a = inputA;
        b = inputB;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int inputA) {
        if (inputA > 0) {
            a = inputA;
        } else {
            System.out.println("Wrong Input!");
        }
    }

    public void setB(int inputB) {
        if (inputB > 0) {
            b = inputB;
        } else {
            System.out.println("Wrong Input!");
        }
    }

    public int area (){
        return a*b;
    }

    public int perimeter(){
        return 2*a+2*b;
    }
}
