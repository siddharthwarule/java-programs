package Array;
//addition of multy dimentional arrya

public class MultyDimentionalArrayExample {
    public static void main(String[] args) {
        int [][]siddharth={{55,45,67},
                           {67,77,80}};

        int[][]sid={{89,90,80},
                    {80,86,76}};

        int[][]result={{0,0,0},
                {0,0,0}};

      for (int i=0;i<siddharth.length;i++){
           for(int j=0;j<siddharth[i].length;j++){

               result[i][j]=sid[i][j]+siddharth[i][j];
           }
      }


        System.out.println("the sum of two array is");

      for (int i=0;i<result.length;i++){
          for (int j=0;j<result[i].length;j++){
              System.out.print(result[i][j]);
              System.out.print(" ");
          }
          System.out.println(" ");
      }



    }
}
