package oops;

import java.util.Random;
import java.util.Scanner;

class game1{
    int noOfGueses;
    int cno;
    int uin;

    public game1(){
        Random rd=new Random();
       this.cno= rd.nextInt(100);

    }

    public void takeUserInput(Scanner in){
        for (int i=0;i<20;i++){
          uin= in.nextInt();
            if(uin<cno){
                System.out.println("your no is lower than computer no chose big no");
            }

            else if(uin>cno){
                System.out.println("your no is greter than computer no chose small no");
            }
            else if(uin==cno){
                System.out.println("your no is equal for Computer No you won");


                System.out.println("your score is :"+i);
                break;
            }
            else {
            }

        }

    }


}

public class game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to owr game....");

        System.out.println("please Choese Your No");
        game1 gm=new game1();
        gm.takeUserInput(sc);

    }
}
