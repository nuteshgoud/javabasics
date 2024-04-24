package oops;

public class OopsDemo {

    public static void main(String[] args) {

        Animal a1= new Animal();

        a1.speak();

        Dog d1 = new Dog();

        d1.speak();

        Animal a2=new Dog();

        a2.speak();
        a2.walk();
        //you cannot access child instance and calling parent
       // Dog d2=new Animal();

        Animal a3= (Animal) new Dog();

        a3.speak();

// not allowed with the instance of casting Dog with Animal class
     /*  Dog  d2 = (Dog)new Animal();

       d2.walk();
       d2.eat();
       d2.speak();*/



        EncapsulationDemo demo=new EncapsulationDemo();

        demo.setA(25);

        demo.setS1("Akhil");

        PolymorphisamDemo polymorphisamDemo=new PolymorphisamDemo();

        polymorphisamDemo.m1();

        polymorphisamDemo.m1(58);

        polymorphisamDemo.m1("Krish");


    }


}
