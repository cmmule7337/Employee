package com.example.Project.Service;

import com.example.Project.DTO.StudentDTO;
import com.example.Project.Entity.StudentEntity;
import com.example.Project.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    private static final Logger logger = (Logger) LoggerFactory.getLogger(StudentService.class);

    public String RegisterStudent(StudentDTO student) {
        logger.info("Registering Student: {} {} | Email: {} | Phone: {} | Tech: {} | College: {} | Location: {} | Hours: {} | Willing: {} | Start: {} | WorkMode: {}",
                student.getFirstName(),
                student.getLastName(),
                student.getEmail(),
                student.getPhoneNumber(),
                student.getTechnology(),
                student.getCollageName(),
                student.getCurrentLocation(),
                student.getLearnOn(),
                student.getCanStartIn(),
                student.getAttendMode()
        );
        StudentEntity std=new StudentEntity();
        std.setFirstName(student.getFirstName());
        std.setLastName(student.getLastName());
        std.setEmail(student.getEmail());
        std.setPhoneNumber(student.getPhoneNumber());
        std.setTechnology(student.getTechnology());
        std.setCollageName(student.getCollageName());
        std.setCurrentName(student.getCurrentLocation());
        std.setLearnOn(student.getLearnOn());
        std.setJoinOn(student.getCanStartIn());
        std.setAttendMode(student.getAttendMode());

        studentRepository.save(std);
        return "Registration successful for Student"+" "+ student.getFirstName()+" "+ student.getLastName();

    }
}