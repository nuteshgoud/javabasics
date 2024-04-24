package in.podtest;

public class Human {

    private String name;

    private int age;

    private float height;

 /* public Human(){
      System.out.println("I am Human class");
    }*/

    public Human(String n,int a){

        name=n;
        age=a;
    }


    public void setAge(int a){
        age=a;
    }

    public int getAge(){
        return age;
    }

    public void setName(String n){
        name=n;
    }

    public void getDetails(int c){

        int id = c;

        System.out.println("Name is:"+name+"Age is:"+age+"Height is:"+height+"Id value is"+id);

    }





}
