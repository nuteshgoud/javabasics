package oops;

public class PolymorphisamDemo {

    //overloading with same method name and signature of the method should be unique
    //change of the return type is not mattered with the overloading
    public void m1(){
        System.out.println("I do not accept any parameter");
    }

    public void m1(int a){
        System.out.println("I do accept integer parameter:"+a);
    }

    public void m1(String b){
        System.out.println("I do accept String parameter:"+b);
    }

  /*  public String m1(){
        return "Akhiil";
    }*/

}
