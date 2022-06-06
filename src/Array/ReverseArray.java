package Array;

public class ReverseArray {
    public static void main(String[] args) {

        int real[]={10,40,50,60,70,80,90};

        int l=real.length;

        System.out.println(l);
        int temp=0;

        int n=Math.floorDiv(l,2);

        for (int i=0;i<n;i++){
            temp=real[i];
            real[i]=real[l-1-i];
            real[l-1-i]=temp;
        }
        System.out.println("THE REVERSE OF ARRAY IS");

        for (int element:real){
            System.out.print(" "+element);
        }

    }
}
