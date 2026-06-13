sealed class A permits B,C{

}
final class B extends A{

}
final class C extends A{

}
class D{

}
public class inheritance1 {
    public static void main(String[] args){
        System.out.println("Inheritance");
    }
    
}
