package oops;

class a{
    public int harry(){
        return 5;
    }

    public void main3(){

        System.out.println("i am a class method");
    }
}

class B extends a{
    @Override
    public void main3(){

        System.out.println("i am b class method");

    }

}

public class methodOveriding {

    public static void main(String[] args) {

        a A=new a();
        B b=new B();

//        A.main3();
        b.main3();

    }
}
