//thats called interfaces usess in java




package oops;

class CellPhones{

    public void calling(){
        System.out.println("you can call");
    }

    public void ringing(){
        System.out.println("call ringing........");
    }

    public void switchOff(){
        System.out.println("Switch of the phone");
    }

    public void switchOnn(){
        System.out.println("Switch on the phone");
    }

}

interface camera{
     void clickPhoto();
     void take4kVideo();
}

interface wifi{
    void connectToThePhone();
    public String[] reciveNetwork();
}


class SmartPhone extends CellPhones implements wifi,camera{

    public void clickPhoto(){
        System.out.println("taking a photo..");
    }

    public void take4kVideo(){
        System.out.println("taking 4k videos..");
    }

    public void connectToThePhone(){
        System.out.println("connecting to the phone");
    }

    public String[] reciveNetwork(){
        String [] networkList={"sid","sonu","siddharth"};

        return networkList;
    }

}


public class phones {
    public static void main(String[] args) {

    SmartPhone sp=new SmartPhone();


//    these all is called the interface and its methods calling
    sp.clickPhoto();
    sp.connectToThePhone();
   String[]network= sp.reciveNetwork();

   for (String net:network) {

       System.out.print(net+" ");

   }
        System.out.println("\n");

   sp.take4kVideo();
    sp.take4kVideo();



    //but here is the new player if you want to restrict the uses of method and perticular interface method we wants to allow for user
        //then new cossept is itrodused polimarphisom only we wantd to use like a camera that is called polimarphisom
        //and we implement those thing with help of method dispaching

        S+
                -+
















































































































                        +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++











































































































































































                                ++++



















































