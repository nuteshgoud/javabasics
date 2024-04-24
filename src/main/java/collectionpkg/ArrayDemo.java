package collectionpkg;

import in.day5.Apple;

import java.security.Key;
import java.util.*;

public class ArrayDemo {

    public static void main(String[] args) {


        ArrayDemo arrayDemo=new ArrayDemo();

       // arrayDemo.listDemo();

       // arrayDemo.setDemo();

      //  arrayDemo.mapDemo();

        arrayDemo.complexDemo();

    }


    public void complexDemo(){

        List<String> row1=new ArrayList<String>();

        row1.add("Akhil");

        row1.add("Male");

        row1.add("19");

        row1.add("Delhi");

        List<String> row2=new ArrayList<String>();

        row2.add("Raju");

        row2.add("Male");

        row2.add("21");

        row2.add("Mumbai");

        Map<Integer,List<String>> webData = new HashMap<Integer, List<String>>();

        webData.put(1,row1);

        webData.put(2,row2);


        Iterator<String> rowData=webData.get(1).iterator();

        while (rowData.hasNext()){
            System.out.println( rowData.next());
        }



    }


    public void collectionDemo(){
         /* //1 variable
        String name ="Akhil";

        //Array
        String[] names=new String[100];

        names[0]="Akhil";
        names[1]="Nutesh";

        //Arrays:primitive objects

        int[] rollNo=new int[5];

        rollNo[0]=1;

        Apple[] appleMobiles=new Apple[6];

        String[] names1=new String[10];

        //collections:objects
        //how to work with the primitive data types?
        //Boxing,UnBoxing,AutoBoxing

        //convert primitive data types into objects

        List<Integer> rollNo=new ArrayList<Integer>();

        //  rollNo.add(new Integer(3));

        Integer i1 = new Integer(5);

        rollNo.add(i1);

        rollNo.add(5);



        Set<String> guestList2=new HashSet<String>();

        Map<String,String> studentNames=new HashMap<String,String>();

        guestList2.add("");*/
    }
    public void listDemo(){

        List<String> guestList=new ArrayList<String>();

        //add
        guestList.add("Akhil");

        guestList.add("sai");

        guestList.add("shobha");

        guestList.add("Akhil");
       /* guestList.add(2);

        guestList.add(true);

        guestList.add(new Apple());*/

        //remove
       guestList.remove("shobha");

        System.out.println(  guestList.size());

        for (String n:guestList){
            System.out.println(n);
        }

    }
    public void setDemo(){
        Set<String> guestList=new HashSet<String>();

        //add
        guestList.add("Akhil");

        guestList.add("sai");

        guestList.add("shobha");

        guestList.add("Akhil");
        System.out.println(guestList.size());
       /* guestList.add(2);

        guestList.add(true);

        guestList.add(new Apple());*/

        //remove
     /*   guestList.remove("shobha");

        System.out.println(guestList.size());

        for (String n:guestList){
            System.out.println(n);
        }*/

        Iterator<String> guestListIterator=guestList.iterator();

       while (guestListIterator.hasNext()){

           System.out.println(guestListIterator.next());
       }



    }

    public void mapDemo(){

        Map<Integer,String> studentName=new HashMap<Integer,String>();

        studentName.put(1,"Nutesh");
        studentName.put(2,"Srinivas");
        studentName.put(3,"Anvesh");
        studentName.put(4,"Srinivas");

       String name= studentName.get(3);

       // System.out.println(name);
       // System.out.println(studentName.size() );

        //remove

        studentName.remove(1);

       Iterator<String> studentNameList=studentName.values().iterator();

       while (studentNameList.hasNext()){
           System.out.println( studentNameList.next());
       }

       Iterator<Integer> studentKeys=studentName.keySet().iterator();



       while (studentKeys.hasNext()){
         //  System.out.println(studentKeys.next());
           int key = studentKeys.next();
           System.out.println("Roll no is:"+key+"student name is"+studentName.get(key));
       }





    }




}
