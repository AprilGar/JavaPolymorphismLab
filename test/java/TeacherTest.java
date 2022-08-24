import human.Student;
import human.Teacher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeacherTest {

    private Teacher teacher;
    private Student student;

    @BeforeEach
    public void setUp(){
        this.teacher = new Teacher("Miss Garlington", "Chemistry");
        this.student = new Student("Charlie", 7, "Walk");
    }

    @Test
    public void canDrink_noParameters(){
        String expected = "Coffee is amazing!";
        String actual = teacher.canDrink();
        assertEquals(expected, actual);
    }

    @Test
    public void canDrink_withParameters(String wine){
        String expected = "Charlie has been ALOT today, I need wine";
        String actual = teacher.canDrink(String message);
        assertEquals(expected, actual);
    }

    @Test
    public void canRemainCalm(){
        String expected = "No problem, I'll go through it again...";
        String actual = teacher.canRemainCalm();
        assertEquals(expected, actual);
    }


}
