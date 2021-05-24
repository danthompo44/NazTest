package com.company;

public class Main {
    public static void main(String[] args) {
        Student dan = new Student("Dan", 19);
        Student naz = new Student("Naz", 17);

        buyDrink(dan);
        buyDrink(naz);
        printName(dan);
        printName(naz);

    }

    private static void buyDrink(Student dave){
        if(dave.isUnderAge()){
            System.out.printf("%s is not old enough\n", dave.getDescription());
        } else {
            System.out.printf("Here's your beer %s\n", dave.getDescription());
        }
    }

    private static void printName(Student student) {
        System.out.println(student.getDescription());


    }
}
