package oops;

class emp {
    int salary;
    String name;

    public int getSalary()
    {
    return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name=n;
    }
    public void setSalary(int s){
        this.salary=s;
    }

}

public class Employee1 {
    public static void main(String[] args) {

        emp sid =new emp();

        sid.setName("siddharth");
        sid.setSalary(1200000);

        System.out.println(sid.getName());
        System.out.println(sid.getSalary());
    }
}
