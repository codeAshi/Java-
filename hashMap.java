import java.util.*;

public class hashMap {
    public static void main(String[] args){
    HashSet<Integer> nums=new HashSet<>();
    HashMap<Integer,String> classtud=new HashMap<>();
    classtud.put(1,"Ashish");
    classtud.put(2,"Raj");
    // for()
    classtud.put(8,"Mane");
    Set<Integer> keys=classtud.keySet();
    for(int i:classtud.keySet()){
        if(classtud.containsKey(i)) System.out.println(i+" "+classtud.get(i));
    }
    System.out.println(classtud);
    System.out.println(classtud.size());
    for(int i=1;i<=classtud.size();i++){
        System.out.println(i+" "+classtud.get(i));
    }
    System.out.println("Printing Hashset USing EntrySet");
    //////////////////////////////////////////////////////
    Set<Map.Entry<Integer,String>> entries=classtud.entrySet();
    for(Map.Entry<Integer,String> entry:entries){
        System.out.println(entry.getKey()+" "+entry.getValue());
    }
    System.out.println("Making hashmap Value To UpperCase");
    for(Map.Entry<Integer,String> entry:entries){
        entry.setValue(entry.getValue().toUpperCase());
        System.out.println(entry.getKey()+" "+entry.getValue());
    }
    System.out.println("Making hashmap value to LowerCase");
    for(Map.Entry<Integer,String> entry:entries){
        entry.setValue(entry.getValue().toLowerCase());
        System.out.println(entry.getKey()+" "+entry.getValue());
    }
    HashMap<Integer, String> stu=new HashMap<>();
    stu.put(1,"Neha");
    stu.put(2,"Raj");
    stu.put(1,"Janvi"); // replace the existing key with new Value
    
    System.out.println(stu);
    // stu.put(null,"Mane");
    System.out.println(stu);
    Set<Map.Entry<Integer,String>> s=stu.entrySet();
    for(Map.Entry<Integer,String> st:s){
        System.out.println(st.getKey()+ " "+st.getValue());
    }
    System.out.println("Rajs Love Story Ending :");
   for(int i:stu.keySet()){
    if(stu.containsKey(i))System.out.println(i+ " "+stu.get(i));
   }

    // nums.add(1);nums.add(2);
    // nums.add(1);
    // nums.add(3);
    //  System.out.println(nums);
    // // nums.remove(2);
    // // System.out.println(nums);
    // for(int i=nums.size();i>=0;i--){
    //     System.out.println(nums);
    //     nums.remove(nums.size());

    // }
    }
    
}
