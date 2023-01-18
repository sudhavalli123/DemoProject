package Controller;

import Service.StudentService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService = studentService;

    }

}
