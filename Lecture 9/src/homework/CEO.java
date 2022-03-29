package homework;

public class CEO extends Person{


    public CEO(String name, int age) {
        super(name, age);
    }


    @Override
    public void setAge(int age) {
        if (age >= 50) {
            super.setAge(age);
        } else {
            System.out.println("The CEO should be at least 50 years old.");
        }
    }
}
