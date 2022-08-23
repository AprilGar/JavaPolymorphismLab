package human;

public abstract class Human {

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

    public String canSpeak(){
        return String.format("Hello, my name is %s.", this.name);
    }

    public String canDrink(){
        return new String("That water is refreshing!");
    }

}
