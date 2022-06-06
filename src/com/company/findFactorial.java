package com.company;

public class findFactorial {

    public static void main(String[] args) {
        int n =5;

        int i=1;
        int facto=1;

        while (i<=n){
            facto *=i;

            i++;
        }
        System.out.println(facto);
    }

}
