public class MethodDemo {
    public static void main(String[] args) {
       // System.out.println( sumValue(9,8));
        methodExample(21,"Nutesh");
        MethodDemo md = new MethodDemo();
      String value= md.name("Nutesh");
        System.out.println(value);

    }
    public static void switchCase(int i){

        switch(i){

            case 0:{
                System.out.println("Did you attend the class?");
                break;}
            case 1:{
                System.out.println("Not good");
                break;}
            case 2:{
                System.out.println("Need Improvement");
                break;}
            case 3:{
                System.out.println("OK");
                break;}
            case 4:{
                System.out.println("Good");
                break;}
            case 5:{
                System.out.println("Doing Good");
                break;}
            default: {
                System.out.println("Value entered is Incorrect, please choose between 0 to 5");
            }
        }
    }
    public static int sumValue(int num1,int num2){

        int sum= num1 + num2;

        return sum;
    }
    public  String name(String name){
        return name;
    }
    public static int methodExample(int age,String name){
        int adultAge;
        if(age > 18){
            System.out.println("name is"+name);
            adultAge = age-18;
            System.out.println("The Adult age of the person is"+adultAge);
        }
        else {
            adultAge=0;
            System.out.println("name is"+name);
        }
        return adultAge;
    }
}
