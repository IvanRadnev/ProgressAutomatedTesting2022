package homework;

public class Manager extends Person{

    private String managedTeam;

    public Manager(String name, int age, String managedTeam) {
        super(name, age);
        this.managedTeam = managedTeam;
    }

    public String getManagedTeam() {
        return managedTeam;
    }

    public void setManagedTeam(String managedTeam) {
        this.managedTeam = managedTeam;
    }
}
