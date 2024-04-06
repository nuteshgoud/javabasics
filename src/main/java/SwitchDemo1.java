public class SwitchDemo1 {

    public static void main(String[] args) {

        char gender = 'M';

        switch (gender){
            case 'M': {
                int a = 10;
                for (int i = 0; i < a; i++) {
                    System.out.println(i);
                }
                System.out.println("you are a Male");
            }
                break;
            default:
                System.out.println("Invalid input");
        }



    }

}
