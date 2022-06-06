package com.company;
 import java.util.Scanner;
public class peson2 {
    Scanner sc = new Scanner(System.in);
  String fname ,mname ,lastname ;
    int len ;

    void accept(){
        System.out.println("enter the first name of person");
           fname = sc.nextLine();
        System.out.println("enter the middle name of that persan") ;
          mname = sc.nextLine();
          System.out.println("enter the last name of person");
           lastname = sc.nextLine();

           len = mname.length();

           String f = mname.substring(0,1);
           String n = mname.substring(1,len);

               f = f.toUpperCase();
           mname = f+n;


    }

    public void display(){
        System.out.println("last name :"+lastname);
        System.out.println("first name :"+fname);
        System.out.println("middle name :"+mname);


    }

    public static void main(String [] args){

        peson2 p1 = new peson2();
         p1.accept();
         p1.display();

    }




}
