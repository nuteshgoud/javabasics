package in.day5;

public class MobileDemo {

    public static void main(String[] args) {
       // Mobile mobile=new Mobile(); cannot create object

        Samsung s1= new Samsung();
        s1.gps();
        s1.calling();
        s1.games();

        Apple a1=new Apple();
        a1.calling();
        a1.gps();

        Mobile s2= new Samsung();
        s2.calling();
        s2.gps();
       // s2.games();cannot access due to interface of parent class i.e Mobile is not having games method

        Mobile a2=new Apple();
        a2.gps();
        a2.calling();

    }

}
