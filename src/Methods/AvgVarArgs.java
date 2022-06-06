package Methods;


public class AvgVarArgs {

    static int varArgs(int ...arg){
        int l= arg.length;
        System.out.println("No of you sub : "+l);
        int total=0;
        int s=0;
        int r=0;
        for (int element:arg){
            s+=element;
        }
        System.out.println("Total marks you earn in exam is : "+s);
        System.out.println("the persentages of your sunjecets is : "+s/l);

        return s/l;
    }

    public static void main(String[] args) {
      int rs=  varArgs(90,80,70,80);
      int rss=  varArgs(90,80,70,80,90,90,60);
      int rsss=  varArgs(90,80,70,80,70,50);
      int rssss=  varArgs(90,80,70,80,70);

//        System.out.println("the persentages of your sunjecets is : "+rs);
//        System.out.println("the persentages of your sunjecets is : "+rss);
//        System.out.println("the persentages of your sunjecets is : "+rsss);
//        System.out.println("the persentages of your sunjecets is : "+rssss);

    }
}
