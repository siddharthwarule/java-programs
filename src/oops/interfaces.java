package oops;

interface sampleInterface{

   public void main();
   public void main2();
}

interface childInterface extends sampleInterface{
   public void math();

}


class MySampleClass  implements childInterface{


  public void math(){
      System.out.println("i am from childInterface");
  }


      public void main(){
        System.out.println("i am from parent class");
    }

    public void main2(){
        System.out.println("i am also parent class interface");
    }

}

public class interfaces {
    public static void main(String[] args) {
        MySampleClass msc=new MySampleClass();

        msc.main();
        msc.main2();
        msc.math();
    }

}
