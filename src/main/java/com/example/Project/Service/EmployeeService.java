package com.example.Project.Service;

import com.example.Project.Controller.EmployeeController;
import com.example.Project.DTO.EmployeeDTO;
import com.example.Project.Entity.EmployeeEntity;
import com.example.Project.Repository.EmployeeRepository;
import jakarta.persistence.Entity;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Project.Entity.EmployeeEntity;

@Service

public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

    public  String RegisterTrainer(EmployeeDTO trainer){
        logger.info("Registering Trainer: {} {} | Email: {} | Phone: {} | Tech: {} | Exp: {} | Location: {} | Hours: {} | Willing: {} | Start: {} | WorkMode: {}",
                trainer.getFirstName(),
                trainer.getLastName(),
                trainer.getEmail(),
                trainer.getPhoneNumber(),
                trainer.getTechnology(),
                trainer.getExperience(),
                trainer.getCurrentLocation(),
                trainer.getNumberOfHourCanTrain(),
                trainer.getWillingToWorkOn(),
                trainer.getStartDate(),
                trainer.getExperience(),
                trainer.getWorkMode()

        );

        EmployeeEntity employee = new EmployeeEntity();
        employee.setFirstName(trainer.getFirstName());
        employee.setLastName(trainer.getLastName());
        employee.setEmail(trainer.getEmail());
        employee.setPhoneNumber(trainer.getPhoneNumber());
        employee.setTechnology(trainer.getTechnology());
        employee.setExperience(trainer.getExperience());
        employee.setCurrentLocation(trainer.getCurrentLocation());
        employee.setNumberOfHourCanTrain(trainer.getNumberOfHourCanTrain());
        employee.setWillingToWorkOn(trainer.getWillingToWorkOn());
        employee.setCanStartIn(trainer.getCanStartIn());
        employee.setStartDate(trainer.getStartDate());
        employee.setExperience(trainer.getExperience());
        employee.setWorkMode(trainer.getWorkMode());

        employeeRepository.save(employee);

        return "Registration successful for Trainer"+" "+ trainer.getFirstName()+" "+ trainer.getLastName();
    }



}
