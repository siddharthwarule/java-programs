package Array;

import java.util.Locale;

public class Array {
    public static void main(String[] args) {

        int []marks=new int[5];  //decleration and making the objects of array

        String [] sid = {"sid","gura","tanmay","rutik","prasad"};


        float sid2[];  //decleration

        sid2=new float[10]; //memory aloocation to these objects

        int sid3[]={10,30,50,60,70,80,90,100}; //best recomended way to create an array

        System.out.println("length of array is"+sid3.length);

        System.out.println(sid3[5]);
        marks[0]=100;
        marks[1]=200;
        marks[2]=300;
        marks[3]=400;
        marks[4]=500;

        System.out.println(marks[3]);

        System.out.println("printing of sid3 array");
        for (int i=0;i<sid3.length;i++){

            System.out.println(sid3[i]);
        }


        // in desending order
        System.out.println("printing of marks array in desending order");

        for(int i=marks.length-1;i>=0;i--){

      System.out.println(marks[i]);
  }

        // for each loop

        System.out.println("by using for each loop print sid Array");

        for(String sidelement: sid){
            System.out.println(sidelement.toUpperCase());
        }





    }
}
