package oops;

class Cyrcle{
    public int radius;

    Cyrcle(int a){
        this.radius=a;

    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }

}
class cylender extends Cyrcle{
   public int height;

   cylender(int r ,int h){
       super(r);
       this.height=h;
   }
   public double volume(){
       return Math.PI*this.radius*this.radius*this.height;
   }
}

public class CircleCylender {
    public static void main(String[] args) {

       cylender cobj=new cylender(12,22);

     double a=  cobj.volume();
      double b= cobj.area();

        System.out.println("area :"+b);
        System.out.println("volume :"+a);

    }
}
