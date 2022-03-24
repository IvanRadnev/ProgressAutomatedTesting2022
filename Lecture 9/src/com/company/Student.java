package com.company;

public class Student extends Person{

    private String takingClasses;

    public Student(int age, double height, String name, String takingClasses) {
        super(age, height, name);
        this.takingClasses = takingClasses;
    }

    public String getTakingClasses() {
        return takingClasses;
    }

    public void setTakingClasses(String takingClasses) {
        this.takingClasses = takingClasses;
    }
}
