package com.company;

public class Cat extends Animal{

    public Cat(String name, String breed, int age){
        setName(name);
        setBreed(breed);
        setAge(age);
    }

    @Override
    public String makeSound() {
        return "Meow";
    }
}
