package Methods;

public class VarArgs {
   static int sum(int x,int ... arr){
       int resut=0;
       int resut2=arr.length;

       for(int element:arr){
           resut+=element;
       }
       return resut;
   }

    public static void main(String[] args) {

     int a=  sum(12,12,12,12,12,12,12);
     int b=  sum(15,15,15);
     int c=  sum(20,20,20);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }

}
