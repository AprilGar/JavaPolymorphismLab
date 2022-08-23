package human;

public class Student extends Human {

    private int yearGroup;
    private String transportHome;

    public Student(String name, int yearGroup, String transportHome){
        super(name);
        this.yearGroup = yearGroup;
        this.transportHome = transportHome;
    }

    @Override
    public String canSpeak(){
        return "Ergh, this is boring! Is it home time yet?";
    }

    public String canLearn(){
        return "OMG Miss G! That was actually interesting!";
    }

    public String canPlay(){
        return "Learning is fun when we make it into a game!";
    }

}
