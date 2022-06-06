package Array;

public class MaxElementsArray {
    public static void main(String[] args) {

        int [] sonu={123,144,156,899,678,999,1000,1234,5768};
          int max=0;
        for (int e:sonu){
            if(e>max){
                max=e;
            }

        }

        System.out.println("the maximum elements of Array is :"+max);

                 // minimum elements of an array
        int min=Integer.MIN_VALUE;
        for (int s:sonu){
            if(s>min){
                min=s;
            }
        }


        System.out.println("minimum value of array is :"+min);

        // the array is sorted or not

        int arrs []={122,123,124,222,333,999};

        for(int i=0;i<arrs.length-1;i++){

            if(arrs[i] > arrs[i+1]){
                System.out.println("the aray is not sorted");
                 break;
            }

        }
        System.out.println("array is sorted");
    }

}
