import java.util.Arrays;
class phone{
    static String name;
    int price;
    String Country;
    void setphone(String n,int p,String c){
        this.name=n;
        this.price=p;
        this.Country=c;
    }
    void give(){
        System.out.println("hello User your "+name+" is ready from "+Country+" payment request of "+price);
    }
}
public class Object {
    public static void main(String[] args){
        phone.name="Ashish";
        phone p1=new phone();
        p1.setphone("Iphone",89,"India");
        p1.give();
        phone p2=new phone();
        p2.setphone("Samsung",90,"US");
        phone.name="Ashish";
        p2.give();
        p1.give();
        // phone.name("Redmi");
        // int n;
        // char[] na=new char[4];
        // for(char i:na){
        //     System.out.println(i);
        // }
        int a=10;
        String s="";
        while (a!=0){
            int temp=a%2;
            a=a/2;
            s=s+Integer.toString(temp);
        }
        System.out.println(s);
        // System.out.println(10%2);
        //  System.out.println(5%2);
        //   System.out.println(2%2);
        //    System.out.println(1%2);
        // System.out.println(a/2);
        // s=Integer.toString(10);
        // System.out.println(s+Integer.toString(10));
        // String.reverse(s);
        String g="1010";
        int result=Integer.parseInt(g,2);
        System.out.println(result);
        String[] num={"1001","001"};
        Arrays.sort(num);
        for(String t:num){
            System.out.println(t);
        }
    }

    
}
