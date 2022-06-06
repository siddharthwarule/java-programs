package com.company;
import java.util.Scanner;
public class rectangle {

    public static void main(String[] args) {
        int area ,length,breadth,perimeter;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Length of Rectangle");
          length = sc.nextInt();
       System.out.println("Enter the breadth of rectangle");
          breadth = sc.nextInt();
          area = length * breadth;
         System.out.println("area of rectangle :"+area);

          perimeter = 2 *(length * breadth);

          System.out.println("perimeter of rectangle :"+perimeter);



    }
}
