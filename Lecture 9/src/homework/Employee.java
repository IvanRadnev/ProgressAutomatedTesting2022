package homework;

public class Employee extends Person{

    private double salary;
    private String team;

    public Employee(String name, int age, double salary, String team) {
        super(name, age);
        this.salary = salary;
        this.team = team;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
