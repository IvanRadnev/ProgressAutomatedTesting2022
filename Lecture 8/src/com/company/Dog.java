package com.company;

public class Dog extends Animal{

    public Dog(String name, String breed, int age){
        setName(name);
        setBreed(breed);
        setAge(age);
    }

    public String makeSound(){
        return "Bark";
    }
}
