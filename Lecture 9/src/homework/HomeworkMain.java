package homework;

public class HomeworkMain {
    public static void main(String[] args) {

        Person[] team = new homework.Person[4];
        team[0] = new Employee("Tom", 2, 3465, "QA Team");
        team[1] = new Employee("Jim", 2, 2743, "QA Team");
        team[2] = new Manager("Bob", 2, "QA Team");
        team[3] = new CEO("Max", 41);

        int averageAge = findAverageAge(team);
        System.out.println("Average age is: " + averageAge);

    }

    private static int findAverageAge(Person[] team){
        int ageSum = 0;

        for (int i = 0; i < team.length; i++) {
            ageSum += team[i].getAge();
        }

        return ageSum / team.length;
    }
}
