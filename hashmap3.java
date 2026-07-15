import java.util.*;
public class hashmap3 {
    public static void main(String[] args){
        HashMap<Character,Integer> charCount=new HashMap<>();
        // ["ab","ty","yt","lc","cl","ab"
        String s="abtyytlcclab";
        for(int i=0;i<s.length();i++)
        {
            if(charCount.containsKey(s.charAt(i))){
                int temp=charCount.get(s.charAt(i));
                charCount.put(s.charAt(i),temp+1);
            }
            else{
                charCount.put(s.charAt(i),1);
            }
        }
        List<Integer> num=new ArrayList<>();
        num.add(30);
        num.add(40);
        System.out.println(num);
        System.out.print(charCount.get('a'));
        System.out.println(charCount);
        String k="";
        String[] a={"ash","ish"};
        for(String b:a){
            k=k+b;
        }
        System.out.println(k);
        System.out.println(charCount.values());
        System.out.println(charCount.keySet());
         boolean b=false;
        int count=0;
        for(int i:charCount.values()){
            if(i%2==0){
                count+=i;
            }else{
                count+=i-1;
                b=true;
            }
        }
        if(b){
            count++;
        }
        // lcyttycl
     System.out.println(count);
    }
    
}
