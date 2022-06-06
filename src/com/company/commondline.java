package com.company;

 class commondline {

    static String temp;

    public static void main(String[] args) {

        for(int i= 0; i<args.length-1;i++){
            for (int j=0; j<args.length-1-i;i++){
               for(int k=j+1; k<args.length-1-i;k++)




                    {
                       temp = args[j];
                       args[k] = args[j];
                       args[j] = temp;
                   }

                System.out.println(args[j]);
            }


        }

    }
}