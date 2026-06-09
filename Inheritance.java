class Parent{
    private String State;
    public void setter(String s){
        this.State=s;
    }
    void getter(){
        System.out.println(State);
    }
    String name="Ashish";
    public Parent(){
        System.out.println("Parent Class Contructor");
    }
    void pa(){
        System.out.println("Parent Class Method");
    }
}
public class Inheritance extends Parent{
    public Inheritance(){
        super();
    }
    void student(){
        System.out.println(name);
    }
    public static void main(String... args){
        // Parent l=new Parent();
        Inheritance p=new Inheritance();
        p.setter("India");
        p.State("US");
        p.getter();
        p.student();
        p.pa();



    }
}
