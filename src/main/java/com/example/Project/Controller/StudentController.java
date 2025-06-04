package com.example.Project.Controller;
import com.example.Project.DTO.StudentDTO;
import com.example.Project.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/student")
    public ResponseEntity<String> registerStudent(@RequestBody StudentDTO dto) {

        String result = studentService.RegisterStudent(dto);
        return ResponseEntity.ok(result);
    }
}
