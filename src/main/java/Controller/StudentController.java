package Controller;

import Service.StudentService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    StudentService studentService;
    String abc;
    public StudentController(StudentService studentService, String abc){
        this.studentService = studentService;
        abc =abc;

    }

}
