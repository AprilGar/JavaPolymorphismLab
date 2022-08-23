import human.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassRoomTest {

    private ClassRoom classRoom;

    @BeforeEach
    public void setUp(){
        classRoom = new ClassRoom(31);
    }

    @Test
    public void canCountStudents(){
        int expected = 0;
        int actual = classRoom.countStudents();
        assertEquals(expected, actual);
    }

    @Test
    public void canAddStudents(){
        Student student = new Student("Bailey", 11, "bus");
        classRoom.addStudent(student);
        int expected = 1;
        int actual = classRoom.countStudents();
        assertEquals(expected, actual);
    }

}
