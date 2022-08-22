import human.Student;

public class School {

    private String schoolName;

    public School(String schoolName){
        this.schoolName = schoolName;
    }

    public void addStudentToClassRoom(Student student, ClassRoom classRoom){
        classRoom.addStudent(student);
    }


}
