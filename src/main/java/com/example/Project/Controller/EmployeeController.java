package com.example.Project.Controller;

import com.example.Project.DTO.EmployeeDTO;
import com.example.Project.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/register")
    public ResponseEntity<String> registerTrainer(@RequestBody EmployeeDTO dto) {

        String result = employeeService.RegisterTrainer(dto);
        return ResponseEntity.ok(result);
    }
}
