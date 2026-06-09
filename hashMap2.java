import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.Arrays;
public class hashMap2 {
    public static void main(String[] args){
        HashMap<Integer,String> student=new HashMap<>();
        student.put(1,"Ashish");
        student.put(2,"Raj");
        student.put(20,"Pankaj");
        System.out.println(student);
        for(int i:student.keySet()){
            System.out.println(i+" "+student.get(i));
        }
        Set<Map.Entry<Integer,String>> s=student.entrySet();
        System.out.println("Roll- Name");
        for(Map.Entry<Integer,String> st:s){
            System.out.println(st.getKey()+"    "+st.getValue());
        }
        List<Integer> list=Arrays.asList(1,2,4,5,67,8,9);
        System.out.println("Element are in List");
        System.out.println(list.contains(5));

    }
    
}
