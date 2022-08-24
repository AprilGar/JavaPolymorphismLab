package human;

public class Teacher extends Human {

    private String subjectSpecialism;
    private Student student;

    public Teacher(String name, String subjectSpecialism){
        super(name);
        this.subjectSpecialism = subjectSpecialism;
    }

    @Override
    public String canDrink(){
        return "Coffee is amazing!";
    }

    //Overload canDrink method
    public String canDrink(String message){
       return String.format("%s has been ALOT today, I need %s", student.getName(), message);
    }

    public String canRemainCalm(){
        return "No problem, I'll go through it again...";
    }

}
