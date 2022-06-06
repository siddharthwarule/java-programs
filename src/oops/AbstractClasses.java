
//abstract method make all class abstract and implemention providede by the child class
//and need to provide all method implemetation otherwise make these class abstract
//we cannot make an objects of absract class
//abstact class is a standerd only which is set for devloper to implement these method of absrtract clas devloper need to make
// sub class of absract class and implements all of the methods present into the absracts classs


package oops;

abstract class parents{

    abstract void printMyName();

    abstract void printMyAge();

}


class child extends parents{


    @Override
    public void printMyName(){
        System.out.println("siddharth");
    }

    @Override
    public void printMyAge(){
        System.out.println(21);
    }

}


//aall about abstract classes
public class AbstractClasses {
    public static void main(String[] args) {
        child ch=new child();
        System.out.println("my name is");
        ch.printMyName();
        System.out.println("my age is");
        ch.printMyAge();

    }


}
