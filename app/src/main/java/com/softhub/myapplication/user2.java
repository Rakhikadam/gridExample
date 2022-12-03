package com.softhub.myapplication;

public class user2 {
    String name="NA";
    String age;
    String email;
    int imagepath=R.drawable.ic_launcher_background;

    public user2(String name, String age, String email, int imagepath) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.imagepath = imagepath;
    }

    public user2(String name, String age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }


    public int getImagepath() {
        return imagepath;
    }

    public void setImagepath(int imagepath) {
        this.imagepath = imagepath;
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
}
