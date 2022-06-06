package Methods;


public class PracticeSet
{
//method for table
    static void multiplication(int n){

        for(int i=1;i<=10;i++){
            System.out.format("%d x %d = %d \n",n,i,n*i );
        }


    }

    static void pattern1(int n){
        //method for pe=rinting patterns

        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

    }


    //method for producing sum of n natural no

    static int sum(int n){
        if(n==1){
            return 1;
        }
        else {
            return n +sum(n-1);
        }
    }


    //reverse pattern
    static void pattern2(int n){
        for(int i=n;i>1;i--){
            for (int j=0;j<i-1;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    //fibinochis series

    static int fib(int n){

        if(n==1||n==2){
            return n-1;
        }
        else{
            return fib(n-2)+fib(n-1);
        }

    }

    public static void main(String[] args) {
        System.out.println("multiplication table");
        multiplication(4);

        System.out.println("pattern printing");
        pattern1(4);

        System.out.println("sum of n number");
        int r=sum(10);
        System.out.println(r);

        System.out.println("pattern in reverse order");
         pattern2(5);

         int fibr=fib(5);
        System.out.println("fibinachi series index no is :"+fibr);
    }
}
