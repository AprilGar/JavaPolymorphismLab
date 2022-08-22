import human.Student;

import java.util.ArrayList;

public class ClassRoom {

    private int roomNumber;
    private ArrayList<Student>students;

    public ClassRoom(int roomNumber){
        this.roomNumber = roomNumber;
        this.students = new ArrayList<>();
    }

   public int countStudents(){
        return this.students.size();
   }

   public void addStudent(Student student){
        this.students.add(student);
   }

}
