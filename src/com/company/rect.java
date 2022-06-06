package com.company;
 import org.w3c.dom.ls.LSOutput;

 import java.sql.SQLOutput;
 import java.util.Scanner;
 public class rect{
     int length,breath,area,perimeter;

     Scanner sc = new Scanner(System.in);

     public void rectangle_Area(){

         System.out.println("Enter the leanth of rectangle");
             length= sc.nextInt();

         System.out.println("Enter the breath of rectangle");
             breath= sc.nextInt();

          area = length * breath;

         System.out.println("area of rectangle is");
          System.out.println(area);


     }

     public void perimeterOfRect(){



         perimeter = 2 * (length*breath);

         System.out.println(perimeter);

     }






     public static void main(String [] args){

         rect r1 =new rect();
          r1.rectangle_Area();
          r1.perimeterOfRect();

       }

}
