package com.company;

public class Student {
    private String description;
    private int age;

    public Student(String description, int age){
        this.description = description;
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isUnderAge(){
        boolean isUnderAge = false;
        if(age < 18){
            isUnderAge = true;
        }
        return isUnderAge;
    }
}
