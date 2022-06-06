package oops;

class cons{
    private int redius;
    private int height;

    public cons(int redius, int height) {
        this.redius = redius;
        this.height = height;

    }

    public int getRedius(){
        return redius;
    }

    public int getHeight(){
        return height;
    }


}


public class constructorusing {
    public static void main(String[] args) {

        cons co=new cons(6,8);

        System.out.println(co.getHeight());
        System.out.println(co.getRedius());

    }
}
