public class ArrayDemo {

//    String name ="Akhil";
//
//    String name2="Derrick";
//
//    String name3="Nutesh";
//
//    String name4="Abhishek";

    String[] studentNames=new String[4];

    public static void main(String[] args) {

        ArrayDemo d1= new ArrayDemo();

        d1.addNames();

       // System.out.println(d1.getNames(3));

        d1.printAllNames();


    }

    public void addNames(){

        studentNames[0]="Akhil";

        studentNames[1]="Derrick";

        studentNames[2]="Nutesh";

        studentNames[3]="Abhishek";

    }

    public String getNames(int indexpos){
        return studentNames[indexpos];
    }


    public void printAllNames(){

        for(int i=0;i<studentNames.length;i++){
            System.out.println(studentNames[i]);
        }
    }

}
