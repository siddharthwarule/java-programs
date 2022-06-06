package com.company;
import java.util.Locale;
import java.util.Scanner;
public class person {
    String fname, mname, lname;
    int len;
    Scanner sc = new Scanner(System.in);

    void accept() {
        System.out.println("enter the first name");
        fname = sc.nextLine();
        System.out.println("enter the middale name");
        mname = sc.nextLine();
        System.out.println("enter the lastname");
        lname = sc.nextLine();
        len = mname.length();
        String f = mname.substring(0,1);
        String fl = mname.substring(1,len);
         f = f.toUpperCase();
         mname = f+fl;
    }

    void display(){
        System.out.println("last name :"+lname);
        System.out.println("middle name :"+mname);
        System.out.println("first name :" +fname);

    }
    public static void main(String [] args){
        person p = new person();
        p.accept();
        p.display();


    }



}




