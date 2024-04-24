package pkg1;

public class Teacher {

    Student student= new Student();

    int a;

    private int b;

    public int c;

    protected  int d;

    public void m1(){

        System.out.println("m1 is public, class is public");
    }


    private void m2(){

        System.out.println("m2 is private,class is public");
    }

    protected void m3(){

        System.out.println("m3 is protected, class is public");
    }

    void m4(){

        System.out.println("m4 is default,class is public");
    }

}
