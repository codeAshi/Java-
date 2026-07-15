import java.util.*;

public class staticBlock {
    static{
        System.out.println("Static Block Called ");
    }
    public static void main(String[] args){
        System.out.println("Main Method");
        Integer a=100;
        Integer b=100;
        System.out.println(a==b);
        Integer x=200;
        Integer y=200;
        System.out.println(x.equals(y));
    }
    
}
