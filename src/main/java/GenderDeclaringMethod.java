public class GenderDeclaringMethod {
    public static void main(String[] args) {

        int age = 45;

        String gender = "Female";

        if(age <0){
            System.out.println("Not Applicable");
        }
        else  if (age >0 && age < 18 && gender.equals("Male")) {

                System.out.println("Boy");
        }
        else  if (age >0 && age < 18 && gender.equals("Female")){

            System.out.println("Girl");
        }

        else if (age >= 18 && age < 60 && gender=="Male") {

                System.out.println("Men");
        }
        else if (age >= 18 && age < 60 && gender=="Female"){

            System.out.println("women");
        }
        else if (age >= 60) {
            System.out.println("Senior Citizen");
        }



    }

}
