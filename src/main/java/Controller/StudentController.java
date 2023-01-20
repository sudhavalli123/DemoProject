package Controller;

import Service.StudentService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    StudentService studentService3;
    String abc;
    public StudentController(String  xyz, String abc){
               abc =abc + xyz;

    }

}
