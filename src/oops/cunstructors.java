package oops;

class con{
    private int id;
    private String name;
    private int salary;




    public con(int salary){
        System.out.println("welcome to our program");
        this.salary=salary;
    }

    public con(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }

}

public class cunstructors {
    public static void main(String[] args) {

        con sid=new con(12,"siddharth");
        con sid2=new con(1200);

      int id=  sid.getId();
       String name= sid.getName();

           int salary= sid2.getSalary();

        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);

    }
}
