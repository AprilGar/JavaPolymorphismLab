import human.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchoolTest {

    private School school;

    private ClassRoom classRoom31;
    private Student student;

    @BeforeEach
    public void setUp(){
        classRoom31 = new ClassRoom(31);
        school = new School("AAA");
        student = new Student("Clara", 9, "walk");
    }

    @Test
    public void canAddStudentToClassRoom(){
        school.addStudentToClassRoom(student,classRoom31);
        int expected = 1;
        int actual = classRoom31.countStudents();
        assertEquals(expected, actual);
    }

}
