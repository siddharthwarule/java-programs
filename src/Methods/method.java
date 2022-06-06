package Methods;

public class method {


    static void change(int [] change)
    {
        change[0]=98;
    }

    static void gm(){
        System.out.println("good morning");
    }

   int logic(int x,int y){
     int z=0;

     if(x>y) {
         z = x + y;
     }else {
         z=y-x;
     }

     return z;
   }

    public static void main(String[] args) {

     method obj1=new method(); //object creation
        //method invocation

     int c=obj1.logic(200,300);
     int s=obj1.logic(400,200); //calling a method
        System.out.println(c);
        System.out.println(s);

     method.gm(); // static method calls


         int []arr={1,2,4,6,5};

         change(arr);

         for (int e:arr){

             System.out.println(e);
         }


    }
}
