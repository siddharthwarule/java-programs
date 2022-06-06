package com.company;


class sortcity {
    public static int A = 11;
    public static int B = 23;
    public static int c = 0;

    public int maxa(int A,int B) {
        c = A + B;
        return c;
    }

    public static void main(String arg[]) {

        sortcity  s1=new sortcity();


             int maxa= s1.maxa(2004,100);

        System.out.println(c);
    }
}
//
//        String name[]=new String[10];
//        int l=arg.length;
//        String temp;
//      for(int i=0;i<l;i++)
//        {
//            name[i]=arg[i];
//        }
//        for(int j=0;j<l;j++)
//        {
//            for(int k=j+1;k<l;k++)
//            {
//                if((name[j].compareTo(name[k]))<0)
//                {
//                    temp=name[j];
//                    name[j]=name[k];
//                    name[k]=temp;
//                }
//            }
//
//            System.out.println("Sorted City Are-");
//            System.out.println(name[j]); }
//
////        for(int i=0;i<l;i++)
////        {
////            System.out.println(name[i]);
////        }
//    }
//}
