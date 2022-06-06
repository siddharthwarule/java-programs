

package com.company;
import java.lang.String;
import java.util.Scanner;

 public class employe {
    int id, salary;
    String name ;
    String department;
    static int numberofobject;
//    String arr [] = new String[10];

    public employe(String name, int id, int salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        numberofobject++;


    }

    public void display(){
        System.out.println("name :"+name+ "  id  :"+id+"  salary :"+salary+"  department :"+department);
    }

    public static void main(String[] args){

        int n = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("how many employee you wnt to enter");
            n = sc.nextInt();
            employe [] ob= new employe[n];

            for (int i = 0; i<n ; i++){
            Scanner      s = new Scanner(System.in);

                   System.out.println("enter id of imployee "+(i+1)+":");
                   int id = sc.nextInt();
                   System.out.println("enter name of employee :"+(i+1)+":");
                    sc.nextLine();
                   String name = sc.nextLine();
                   System.out.println("enter name of salary :"+(i+1)+":");
                   int salary = sc.nextInt();
                   System.out.println("enter name of department :"+(i+1)+":");
                   sc.nextLine();
                    String deprtment = sc.nextLine();

                ob[i] = new employe(name,id,salary,deprtment);
                System.out.println("number of object"+numberofobject);

            }
            for(int i=0; i<n; i++){
                ob[i].display();


            }

//        employe a = new employe("sid",1 ,200 ,2);
//          System.out.println("display object one :");
//           a.display();
//
//           employe b = new employe("siddharth",22,400,4);
//        System.out.println("display object two :");
//           b.display();
    }


}
