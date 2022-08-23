import human.Teacher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeacherTest {

    private Teacher teacher;

    @BeforeEach
    public void setUp(){
        this.teacher = new Teacher("Miss Garlington", "Chemistry");
    }

    @Test
    public void canDrink(){
        String expected = "Coffee is amazing!";
        String actual = teacher.canDrink();
        assertEquals(expected, actual);
    }

    @Test
    public void canRemainCalm(){
        String expected = "No problem, I'll go through it again...";
        String actual = teacher.canRemainCalm();
        assertEquals(expected, actual);
    }


}
