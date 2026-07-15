import java.util.*;
class StringReverse{
    public static void main(String[] args){
        String s="Ashish";
        System.out.println("Here");
        System.out.print(s.contains("sa"));
        StringBuilder res=new StringBuilder();
        res.append(s);
        System.out.println(res);
        HashSet<Character> v=new HashSet();
        v.add('d');
        
        System.out.println(v);
        System.out.println(res.charAt(2));
        // res.charAt(2)="s";
        int i=2;
        // res.setCharAt(i,"s");
        res.setCharAt(i, 's'); 
        System.out.println(res);

    }
}