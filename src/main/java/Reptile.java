public class Reptile {

    public static void main(String[] args) {
    Reptile reptile=new Reptile();




        reptile.printInfo("cobra","red");
    }

    public void printInfo(String name,String color){

        if(color == "red"){
            System.out.println("reptile name is :"+name+"is dangerous because color is"+color);
        }
    }
    public String printName(String name,String color){

        if(color == "red"){
            System.out.println("reptile name is :"+name+"is dangerous because color is"+color);
        }
        return name;
    }

    class Animal{
        String name;
        public void printInfo(String name){
            System.out.println("the value of name is ");
        }
    }
}

