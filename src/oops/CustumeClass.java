package oops;

 class Employee{

     int id;
     String name;
     int salary;

     public void printdetials() {
         System.out.println("my id is " + this.id);
         System.out.println("my name is " + this.name);
     }
     public int getSalary(){
        return salary;
         }

}

public class CustumeClass {
    public static void main(String[] args) {

        //making object of custume class
        Employee sid =new Employee();
        Employee gura =new Employee();

     //seting attribute/propertyes
        sid.id=10;
        sid.name="sid";
        sid.salary=1200000;

        gura.id=20;
        gura.name="gura";
        gura.salary=500000;

        //priting the properties
//        System.out.println("id of Employee : "+sid.id);
//        System.out.println("name of Employee : "+sid.name);

       //calling the behavior of class /method by object
        sid.printdetials();
        int salary=sid.getSalary();
        System.out.println("my salary is :"+salary);


        gura.printdetials();
        int salar=gura.getSalary();
        System.out.println("my salary is  :" +salar);


    }
}
