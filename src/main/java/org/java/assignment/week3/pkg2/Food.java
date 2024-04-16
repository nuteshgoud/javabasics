package org.java.assignment.week3.pkg2;

import org.java.assignment.week3.pkg1.Animal;

public class Food {


    public static void main(String[] args) {


        Animal animal= new Animal("food",8,"Everyone",45);

        //public method and public instance variable is accessed remaining access modifier methods and variables are not allowed
        animal.eat();

        //animal.gender();

        //animal.walk();

        //animal.getDetails();

        animal.name="lion";

        //animal.surname="surname";

        //animal.id=84;

        //animal.age=45;


    }

}
