import java.util.*;
public class Queue1 {
    int a=9;
    
    public static void main(String[] a){
        Queue<String> counter=new LinkedList<>();
        Queue<Integer> num=new PriorityQueue<>();
        var b=10;
        System.out.println(a);
        System.out.println(b);
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(10);
        num.add(10);
        System.out.println(num);
        counter.add("Ashish");
        counter.add("Raj");
        counter.add("Shrinivas");
        System.out.println(counter);
        System.out.println(counter.peek());
        // System.out.println(counter.poll());
        System.out.println(counter);
        String[] names={"Ashish","asdfg","Ketan","abc"};
        for(int i=0;i<names.length;i++){
            counter.add(names[i]);
            System.out.println(counter);
        }

    }
    
}
