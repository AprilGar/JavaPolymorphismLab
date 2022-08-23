package human;

public class Teacher extends Human {

    private String subjectSpecialism;

    public Teacher(String name, String subjectSpecialism){
        super(name);
        this.subjectSpecialism = subjectSpecialism;
    }

    @Override
    public String canDrink(){
        return "Coffee is amazing!";
    }

    public String canRemainCalm(){
        return "No problem, I'll go through it again...";
    }


}
