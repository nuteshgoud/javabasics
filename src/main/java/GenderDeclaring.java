public class GenderDeclaring {

    public static void main(String[] args) {

        int age = -59;

        char gender = 'f';

        if(age <0){
            System.out.println("NA");
        }

      else  if (age >0 && age < 18) {

            if (gender == 'm') {
                System.out.println("Boy");
            }
            else
                System.out.println("Girl");
        } else if (age >= 18 && age < 60) {
            if (gender == 'm') {
                System.out.println("Men");
            } else
                System.out.println("women");

        }else if (age >= 60) {
                System.out.println("Senior Citizen");
            }

        }
    }
