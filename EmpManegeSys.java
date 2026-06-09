class Employee{
    String Name;
    int Salary;
    void Setter(String s,int n){
        this.Name=s;
        this.Salary=n;
    }
    void getter(){
        System.out.println("Hello "+Name+" Your Salary is Credited \n to your Account \nThank You!");
    }
}

public class EmpManegeSys extends Employee {


    void show(String d){
        
        System.out.println(d);
        
    }
    public static void main(String[] args){
        int s=-15;
        int a=1;
        System.err.println("Error");
        System.out.println();
        System.out.println(s>>a);
        System.out.println(s>>>a);
       // System.out.println(s);
        String Department="Software Developer";
        EmpManegeSys manger=new EmpManegeSys();
        // manger.setter("Ashish",19);
        // manger.show(Department);
        manger.getter();


    }
    
}
