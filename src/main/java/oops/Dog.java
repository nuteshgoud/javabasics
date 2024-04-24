package oops;

public class Dog extends Animal{


    public Dog(){
      //  super();
    super();
    //super cannot used twice and parameter of the value need to be included
    //if method of parent is overridden by passing the value invoke that method
    }

    public void speak(){

        System.out.println("Dogs barks");
    }

    public void eat(){

        System.out.println("Dog is Eating");
    }


}
