package Array;

public class MultyDimentionalArray {
    public static void main(String[] args) {

        //multidimentional arrays are array of array

        int []sid1;   //1 d array refrence
        int [][] flat;//2 d array  //columb and then row
        flat=new int[2][3];

        flat[0][0]=101;
        flat[0][1]=102;
        flat[0][2]=103;
        flat[1][0]=104;
        flat[1][1]=105;
        flat[1][2]=106;


        System.out.println(flat[1][1]);
        System.out.println("displaying two-d Array using for loop");

        for (int i=0;i<flat.length;i++){
                for(int j=0;j<flat[i].length;j++){
                 System.out.print(flat[i][j]);
                    System.out.print(" ");
                }
            System.out.println("");
        }



        System.out.println("  element of mulydimentional aerray by for eaach loop is :");
        for (int[] element:flat){
            System.out.print(element);
        }

    }
}
