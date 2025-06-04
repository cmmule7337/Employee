    package com.example.Project.DTO;

    import java.time.LocalDate;

   // @Data
    public class EmployeeDTO {
        private String firstName;
        private String lastName;

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
           this.technology = technology;
       }

       public String getExperience() {
           return experience;
       }

       public void setExperience(String experience) {
           this.experience = experience;
       }

       public String getCurrentLocation() {
           return currentLocation;
       }

       public void setCurrentLocation(String currentLocation) {
           this.currentLocation = currentLocation;
       }

       public String getNumberOfHourCanTrain() {
           return numberOfHourCanTrain;
       }

       public void setNumberOfHourCanTrain(String numberOfHourCanTrain) {
           this.numberOfHourCanTrain = numberOfHourCanTrain;
       }

       public String getWillingToWorkOn() {
           return willingToWorkOn;
       }

       public void setWillingToWorkOn(String willingToWorkOn) {
           this.willingToWorkOn = willingToWorkOn;
       }

       public String getCanStartIn() {
           return canStartIn;
       }

       public void setCanStartIn(String canStartIn) {
           this.canStartIn = canStartIn;
       }

       public LocalDate getStartDate() {
           return startDate;
       }

       public void setStartDate(LocalDate startDate) {
           this.startDate = startDate;
       }

       public boolean isHaveTeachingExp() {
           return haveTeachingExp;
       }

       public void setHaveTeachingExp(boolean haveTeachingExp) {
           this.haveTeachingExp = haveTeachingExp;
       }

       public String getWorkMode() {
           return workMode;
       }

       public void setWorkMode(String workMode) {
           this.workMode = workMode;
       }

       private String email;
        private String  phoneNumber;
        private String technology;
        private String experience;
         private String currentLocation;
         private String numberOfHourCanTrain;
         private String willingToWorkOn;
        private  String canStartIn;
        private LocalDate startDate;
         private boolean haveTeachingExp;
         private String workMode;

    }
