package com.company;

import java.sql.SQLOutput;

class con {
     String s1 = "siddharth";
     String s2 = "warule";

     public void connect(){

         System.out.println("coonection of both string is "+s1+s2);

     }


 }
     class com extends con {

     String s1 = "siddharth";
     String s2 = "sidd";

     public void display(){
         System.out.println("comparison between both strings are   "+  s1.equals(s2));
     }

     public static void main (String [] args){

         com c1 = new com();
          c1.display();
          c1.connect();

     }


}