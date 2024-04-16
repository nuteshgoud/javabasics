package org.java.assignment.week3.pkg1;

public class Dog extends Animal{
    Dog(String name, int age, String surname, int id) {

        super(name, age, surname, id);

        System.out.println("Dog Class");
    }

    public static void main(String[] args) {

        Animal animal= new Animal("human",15,"firstname",15);

        animal.eat();

        //private method is limited to its class,gender method is not allowed to access.

        //animal.gender();

        animal.walk();

        animal.getDetails();

        animal.name="Human_public";

        animal.surname="surnameTest";

        animal.id=84;

        //age instance variable is not accessed due to private
        //animal.age=45;


    }
}
