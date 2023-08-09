package com.example.teachpc;

public class User {

    public String firstName,lastName, age, email,studentID;

    public User(){

    }

    public User(String fullName,String lastName, String age, String email,String studentID){
        this.firstName = fullName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.studentID = studentID;

    }



}
