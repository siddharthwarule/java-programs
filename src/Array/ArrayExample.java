package Array;

public class ArrayExample {
    public static void main(String[] args) {

        float[]marks={70.5f,50f,80.9f,90.1f,89.3f,70.8f,67.9f,78.9f};
        float per=0;
        float sum=0;
        for(float j=0;j<marks.length;j++){

            System.out.println(marks[(int)j]);
        }

        boolean isAnArrayPresent=false;
        float num=70.4f;



        for(float element:marks)
         {
             //element presents or not
             if(num==element){
               isAnArrayPresent=true;
             }


          sum=  sum+element;
          per= sum/marks.length;

        }

     if(isAnArrayPresent==true){
         System.out.println("the element is presents in an array");


     }
   else {
         System.out.println("the element is not presents");

     }
        System.out.println("the value of sum is :"+sum);
        System.out.println("the value of persentage in Array :"+per);
    }
}
