package Controller;

import Service.StudentService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService = studentService;

    }

    public void test(StudentService studentService1){
        this.studentService = studentService1;

    }

}
