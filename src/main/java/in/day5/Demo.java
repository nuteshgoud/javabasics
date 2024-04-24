package in.day5;

public class Demo {

    public static int a=9;

    public int b=10;

    public static void main(String[] args) {//static
        System.out.println(a);//static

      //  System.out.println(b);//nonstatic

       // m1();

        Demo d = new Demo();

        d.m1();
        m2();

    }


    public void m3(){

    }
    public static void m2(){

        System.out.println("m2 method");
    }

    public void m1(){

        System.out.println(a);//static

        System.out.println(b);//non static

        m2();
    }


}
