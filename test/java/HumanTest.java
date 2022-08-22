import human.Human;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanTest {

    private Human human;

    @BeforeEach
    public void SetUp(){human = new Human("Eric");
    }

    @Test
    public void canSpeak(){
        String expected = "Hello, my name is Eric.";
        String actual = human.speak();
        assertEquals(expected, actual);
    }

    @Test
    public void canDrink(){
        String expected = "That water is refreshing!";
        String actual = human.drink();
        assertEquals(expected, actual);
    }


}
