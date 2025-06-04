package com.example.Project.Entity;

import jakarta.persistence.*;


@Entity
@Table(name="Student_Data")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String technology;
    private  String collageName;
    private String currentLocation;
    private String learnOn;
    private String joinOn;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        technology = technology;
    }

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentName(String currentName) {
        this.currentLocation = currentName;
    }

    public String getLearnOn() {
        return learnOn;
    }

    public void setLearnOn(String learnOn) {
        this.learnOn = learnOn;
    }

    public String getJoinOn() {
        return joinOn;
    }

    public void setJoinOn(String joinOn) {
        this.joinOn = joinOn;
    }

    public String getAttendMode() {
        return attendMode;
    }

    public void setAttendMode(String attendMode) {
        this.attendMode = attendMode;
    }

    private String attendMode;


}
