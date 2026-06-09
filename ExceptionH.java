import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
public class ExceptionH {
    public static void main(String args[]){
         Map<Integer,String> str=Map.of(1,"",2,"abc",3,"def",4,"ghi",5,"jkl",6,"mno",7,"pqrs",8,"tuv",9,"wxyz",0,"");
        System.out.println(str.get(2));
        String s="23";
        String l="45";
        char temp1=s.charAt(0);
        char temp2=l.charAt(0);
        System.out.println("hello");
        String res=""+temp1+temp2;
        System.out.println(res);
        String[] num=s.split("");
        ArrayList<String> re=new ArrayList<>();
        int r=Integer.parseInt(s);
        System.out.println(r);
        re.add("Ashish");
        System.out.println(!re.contains("Ashish"));
        int i=2;
        System.out.println(re);
        System.out.println(str.get(i));
        // for(String i:num){

        // }
    }
    
}
