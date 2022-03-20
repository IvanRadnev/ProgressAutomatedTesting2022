package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rectangle rectangle = new Rectangle(4, 5);

        System.out.println("Rectangle area = " + rectangle.area());
        System.out.println("Rectangle perimeter = " + rectangle.perimeter());

        //Ex.1
        Rectangle[] rectangles = new Rectangle[3];

        rectangles[0] = new Rectangle(2, 3);
        rectangles[1] = new Rectangle(5, 2);
        rectangles[2] = new Rectangle(3, 4);

        for (int i = 0; i < rectangles.length; i++) {
            System.out.println(rectangles[i].area());
        }

        //
    }
}
