package oops;

class sqr{
    int side;

    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

public class Square {
    public static void main(String[] args) {

        sqr sqr=new sqr();
        sqr.side=3;

      int ar=  sqr.area();
      int per=  sqr.perimeter();
        System.out.println(ar);
        System.out.println(per);

    }
}