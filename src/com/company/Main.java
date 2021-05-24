package com.company;

public class Main {
    public static void main(String[] args) {
        Student dan = new Student("Dan", 19);
        Student naz = new Student("Naz", 17);

        buyDrink(dan);
        buyDrink(naz);
    }

    private static void buyDrink(Student student){
        if(student.isUnderAge()){
            System.out.printf("%s is not old enough\n", student.getDescription());
        } else {
            System.out.printf("Here's your beer %s\n", student.getDescription());
        }
    }
}
