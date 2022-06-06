package oops;

//inheritance explained

class base{  //base super parenets class
   private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class derived extends base  //child derived class
{
   private int y;


    public void setY(int y){
        this.y=y;
    }

    public int getY(){
        return y;
    }

}

public class inheritance {
    public static void main(String[] args) {

        derived dir=new derived();

        dir.setX(10);
        dir.setY(20);

      int y=  dir.getX();
       int x= dir.getY();

        System.out.println(x);
        System.out.println(y);
    }

}
