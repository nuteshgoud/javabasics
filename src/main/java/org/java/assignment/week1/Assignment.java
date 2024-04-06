package org.java.assignment.week1;

public class Assignment {

    public static void main(String[] args) {

        choiceOfValue(5,3,"square");
        choiceOfValue(5,3,"cube");
        choiceOfValue(8,15,"test");

        choiceOfSwitchValue(5,3,"square");
        choiceOfSwitchValue(5,3,"cube");
        choiceOfSwitchValue(8,15,"test");
        System.out.println("-----------------------------------");
       reversePatternHalf();
        System.out.println("-----------------------------------");
        reversePatternFull();

    }
    
   public static void choiceOfValue(int num1,int num2,String value){

        if(value.equals("square")){

            int squareness= ((num1*num1) +(2*num1*num2)+(num2*num2));

            System.out.println("the value of square is:"+squareness);

        }else if(value.equals("cube"))
        {
            int cubevalue= ((num1*num1*num1) +(3*num1*num1*num2)+(num2*num2*num2)+(3*num1*num2*num2));

            System.out.println("the value of cube is:"+cubevalue);
        }
        else {
            System.out.println("please select the correct value");
        }
    }

    public static void choiceOfSwitchValue(int num1,int num2,String value){
        switch (value){
            case "square":{
                int squareness= (int) ((Math.pow(num1,2)) +(2*num1*num2)+(Math.pow(num2,2)));

                System.out.println("the value of square is:"+squareness);
            }
            break;
            case "cube": {
                int cubevalue= (int) ((Math.pow(num1,3)) +(3*(Math.pow(num1,2))*num2)+(Math.pow(num2,3))+(3*num1*(Math.pow(num2,2))));

                System.out.println("the value of cube is:"+cubevalue);
            }
            break;
            default:
            {
                System.out.println("please select the correct value");
            }

        }

    }

    public static void reversePatternHalf(){
        for(int i=0;i<5;i++){
            for (int j=0;j<i;j++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }

    public static void reversePatternFull(){
        for(int i=5;i>=3;i--){

            for (int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
    }
}
