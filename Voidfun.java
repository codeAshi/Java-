abstract class tv{
  abstract void run2();
}
class test extends tv{
    @Override
    void run2(){
        System.out.println("Tv ON");
    }
}
class Cars{
    String Name;
    public Cars(String d){
        this.Name=d;
    }
     void printing(){
        System.out.print(Name);
    }
}
class Voidfun extends Cars{
  
    // @Override
    // void run2(){
    //     System.out.println("TV is ON");
    // }

    public Voidfun(String d){
        super(d);
        System.out.println("Constructor is Called voidfun");

    }
 
    void run(){
        System.out.println("Hello Iam Here");
        String s="hello";
        // return s; Cannot return Value
    }
    public static void main(String[] args){
        Voidfun v=new Voidfun("BMW");
        test t=new test();
        t.run2();
        v.run();
        v.printing();
        // v.run2();
        

    }
}