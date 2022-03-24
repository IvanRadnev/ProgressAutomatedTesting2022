package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Person[] person = new Person[3];
        person[0] = new Teacher(35, 185, "Yavor", "QA Automation");
        person[1] = new Student(8, 145, "Goshko", "QA Automation");
        person[2] = new Student(18, 155, "Mitko", "QA Automation");

        int averageAge = findAverageAge(person);
        System.out.println("Average age is: " + averageAge);

    }

    private static int findAverageAge(Person[] person) {
        int ageSum = 0;

        for (int i = 0; i < person.length; i++) {
            ageSum += person[i].getAge();
        }

        return ageSum / person.length;
    }
}
