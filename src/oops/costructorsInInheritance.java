package oops;

//costructor in inheritance

class base1 {


    base1(){
        System.out.println("i am base class contructor");
    }

     base1(int x){
         this.x=x;
        System.out.println("i am a base overloaded costructor"+x);
    }

    public int x;

     public int getX(){
         return x;
     }

}
class derived2 extends base1
{

    derived2(){
        System.out.println("i am derived class costructor");
    }

//costructors
      derived2(int x,int y){

         super(x);
         //if you wants to print parameterised costructor of base class then use super keyword with parameter it call the parent class cosnstructir
         //other wise its calls non parameterised constructors
          this.y=y;
    System.out.println("i am derived constructor"+y);
}

    public int y;

      public int getY(){
          return y;
      }

}

class ChildOfDerived extends derived2
{

    ChildOfDerived(int a,int b,int c){
    super(a ,c);

        System.out.println("i am chiled of derived class costructors"+b);

    }

}



public class costructorsInInheritance {
    public static void main(String[] args) {

//        base1 bs=new base1(16);
//        derived2 dr=new derived2();
//        derived drs=new derived();

        ChildOfDerived cod=new ChildOfDerived(12,13,14);

    }
}
