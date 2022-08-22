package human;

public class Human {

    private String name;

    public Human(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String speak(){
        return String.format("Hello, my name is %s.", this.name);
    }

    public String drink(){
        return new String("That water is refreshing!");
    }

}
