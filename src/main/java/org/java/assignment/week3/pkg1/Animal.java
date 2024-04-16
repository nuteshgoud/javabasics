package org.java.assignment.week3.pkg1;

public class Animal {

   public String name;

   private int age;

   protected String surname;

   int id;

    public static void main(String[] args) {
        Animal animal=new Animal("Nutesh",12,"nadimpally",36);

        System.out.println(animal.age);
    }
 public  Animal(String n,int a,String s,int i){
        name=n;
        age=a;
        surname=s;
        id=i;
   }

    public void eat(){
        System.out.println("public class of Animal having public method having eat");
    }

    private void gender(){
        System.out.println("public class of Animal having private method having gender");
    }

    protected void walk(){
        System.out.println("public class of Animal having protected method having walk");
    }

      void getDetails(){
          System.out.println("public class of Animal having default method having getDetails");

      }
}
