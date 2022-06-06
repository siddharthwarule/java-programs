package com.company;
import java.util.Scanner;
public class city {
    public static void main(String[] args) {


        int n ;
        String temp;
        System.out.println("enter the number of city");
        Scanner sc = new Scanner(System.in);

        n= sc.nextInt();

        String [] arr = new String[n];


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();


        }

        for(int i =0 ; i< n; i++){
            System.out.println(arr[i]);

        }


//        for (int i=0; i<n-1; i++){
//          //  System.out.println(arr[i]);
//        for(int j =0; j<arr.length-i-1;j++){
//            for(int k=j+1; k<args.length-1-i;k++){
//
////            if((arr[j].compareTo(arr[j+i]))<0) {
////                //swap
////                temp = arr[j];
////                arr[j] = arr[k];
////                arr[k] = temp;
//
//
//            }
//            }
//            }
//            arr[i] = sc.nextLine();
        }


    }



