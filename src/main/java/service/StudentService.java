package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    public static void main(String... args){
        StudentService ss=new String.format();
        ss.addStudent();
        ss.getStudents();

    }

    public void addStudent(){
      Student student=new Student();
      List<Student> StudentList = new ArrayList<Student>();
      Student.setStudentId("001");
      Student.setname("name");
      Student.setcourse("BCA");
      Student.setStartDAte("21/07/2023");
      Student.setEndDAte("21/07/2027");
    }

    public List<Student> getStudents(){
        return new ArrayList<Student>();
    }
}
