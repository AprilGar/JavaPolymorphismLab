package human;

public class Student extends Human{

    private int age;
    private String transportHome;

    public Student(String name, int age, String transportHome){
        super(name);
        this.age = age;
        this.transportHome = transportHome;
    }

}
