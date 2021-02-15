package com.company;

import java.time.LocalDate;

public class HeartRates {
    private String firstname;
    private String lastname;
    private int date_of_birth;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private int age;


    public HeartRates(String firstname, String lastname,  int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }
    public String returnTargetHeartRate(){
        return String.format("The name is %s %s%nDate of birth is %s%nThe age is %d%nThe " +
                "maximum heart rate is %d%n" +
                "The target heart rate is %s",getFirstname(),getLastname(),
                getDate_of_birth(),getAge(),
                maximumHeartRate(),TargetHeartRate());

    }
    private int getAge(){
        age = 2021-getYearOfBirth();
        return age;
    }
    private int maximumHeartRate(){
        return 220 - age;
    }
    private String TargetHeartRate(){
        int lower = (50*age)/100;
        int highest = (85*age)/100;
        return String.format("your target heart rate range is %d-%d",lower,highest);
    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDate_of_birth() {
        return String.format("%d/%d/%d",getDayOfBirth(),getMonthOfBirth(),getYearOfBirth());
    }



    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
