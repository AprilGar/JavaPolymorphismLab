import human.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    private Student student;

    @BeforeEach
    public void setUp(){
        student = new Student("Logan", 7, "Collection in car");
    }

    @Test
    public void canSpeak(){
        String expected = "Ergh, this is boring! Is it home time yet?";
        String actual = student.canSpeak();
        assertEquals(expected, actual);
    }
    @Test
    public void canLearn(){
        String expected = "OMG Miss G! That was actually interesting!";
        String actual =  student.canLearn();
        assertEquals(expected, actual);
    }

    @Test
    public void canPlay(){
        String expected = "Learning is fun when we make it into a game!";
        String actual =  student.canPlay();
        assertEquals(expected, actual);
    }

}
