public class VariableDemo {

    public static void main(String[] args) {
        VariableDemo vd = new VariableDemo();


    }

    String firstName;

    public void method1(){

        String middleName="Jain";

        //cann't use the lastname variable due to value is only needed in the method2
       // System.out.printf("Complete Name is:%s%s%s%n", firstName, middleName, lastName);
    }

    public void method2(){

        String lastName;
    }

}
