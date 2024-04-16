package org.java.assignment.week3.pkg1;

public class Human {

    public static void main(String[] args) {


        Animal animal= new Animal("human",15,"firstname",15);

        animal.eat();

        //private method is limited to its class,gender method is not allowed to access.

      //animal.gender();

        animal.walk();

        animal.getDetails();

        animal.name="Human_public";

        animal.surname="surnameHuman";

        animal.id=84;

        //age instance variable is not accessed due to private
       // animal.age=45;


    }



}
