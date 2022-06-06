package Methods;

public class MethodOverloading {

    static void fo(int a){
        System.out.println("good morning "+ a +" bro...");
    }
    static void fo(String name){
        System.out.println("good morning "+name+" have a nice day");
    }
    static void fo(String []arr){
        System.out.println("GOOD MORNING " +arr[0] +" HAVE A NICE DAY");
    }


    public static void main(String[] args) {

    fo(1000);                        //METHOD CALLING
        fo("sidddharth");
        String arrs[]={"SID","SONU"};
        fo(arrs);

    }
}
