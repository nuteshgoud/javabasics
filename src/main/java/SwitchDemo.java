public class SwitchDemo {

    public static void main(String[] args) {

        int i=10;

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

}
