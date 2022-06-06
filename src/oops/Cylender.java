package oops;

class cyl{
    private int redius;
    private int height;

    public int getRedius() {
        return redius;
    }

    public void setRedius(int redius) {
        this.redius = redius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
public double surfaceArea(){
        return 2*Math.PI*redius*redius+2*Math.PI*redius*height;
}
public double volume(){
        return Math.PI*redius*redius*height;
}

}


public class Cylender {

    public static void main(String[] args) {

        cyl obj=new cyl();

        obj.setHeight(12);
        int a= obj.getHeight();
        obj.setRedius(9);
        int b= obj.getRedius();
        double c= obj.surfaceArea();
        double d= obj.volume();


        System.out.println("height of cylender is :" +a);
        System.out.println("Redius of cylender :" +b);
        System.out.println("Surface area of cylender is:"+c);
        System.out.println("volume of cylender is:"+d);



    }

}
