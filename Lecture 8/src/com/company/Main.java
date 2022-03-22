package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dog dog = new Dog("Rex", "Pitbull", 2);
        System.out.println(dog.makeSound());

        Cat cat = new Cat("Tom", "Kotka", 5);
        System.out.println(cat.makeSound());
    }
}
