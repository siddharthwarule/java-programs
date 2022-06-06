package oops;

class ExClass {
    int a;

    ExClass(){

    }

    ExClass(int y) {
        this.a = y;
    }

    public int getA() {
        return a;
    }

    public int retuenone() {
        return 1;
    }

}

class DoClass extends ExClass
{
    DoClass(){

//        super(c);
        System.out.println("i am do class costructor");
    }

}




public class ThisSuper {
    public static void main(String[] args) {

//        ExClass ex=new ExClass(20);
        DoClass doc=new DoClass();

        System.out.println(doc.getA());


    }

}
