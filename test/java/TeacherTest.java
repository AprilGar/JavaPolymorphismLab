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
    public void canDrink(){
        String expected = "Coffee is amazing!";
        String actual = teacher.canDrink();
        assertEquals(expected, actual);
    }

    @Test
    public void canDrink(String wine){
        int expected = "Charlie has been ALOT today, I need wine";
        int actual = teacher.canDrink(String message);
        assertEquals(expected, actual);
    }

    @Test
    public void canRemainCalm(){
        String expected = "No problem, I'll go through it again...";
        String actual = teacher.canRemainCalm();
        assertEquals(expected, actual);
    }


}
