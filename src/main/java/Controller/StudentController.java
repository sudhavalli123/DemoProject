package Controller;

import Service.StudentService;
import entity.Student;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    StudentService studentService3;
    Student student;
    String abc;
    public StudentController(String  xyz, String abc) {
        abc = abc + xyz;

        StudentService studentService;
        Student student;
    }
    public StudentController(String abc, Student student1){
        this.student = student1;

    }

    public void testabc(Student student2){
        this.student = student2;


    }

}
