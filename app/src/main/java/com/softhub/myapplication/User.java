package com.softhub.myapplication;

 public class User {
     String name;
     String age;
     String email;
     String dob;
     String education;

     public User() {
     }

     public User(String name, String age, String email, String dob, String education) {
         this.name = name;
         this.age = age;
         this.email = email;
         this.dob = dob;
         this.education = education;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getAge() {
         return age;
     }

     public void setAge(String age) {
         this.age = age;
     }

     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     public String getDob() {
         return dob;
     }

     public void setDob(String dob) {
         this.dob = dob;
     }

     public String getEducation() {
         return education;
     }

     public void setEducation(String education) {
         this.education = education;
     }
 }
