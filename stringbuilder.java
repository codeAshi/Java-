import java.util.*;
class stringbuilder{
    public static void main(String[] args){
        StringBuilder res=new StringBuilder();
        res.append("AShish");
        System.out.println(res);
        res.deleteCharAt(res.length()-1);
        System.out.println(res);
        res.append(res);
        System.out.println(res);
        res.reverse();
        System.out.println(res);
        String s="Abcd";
        int[] nums={1,2,3,2,2,3,1,4};

        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i+1;j<nums.length-1;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        // int sum=0;
        for(int i=0;i<s.length();i++){
           int  sum=s.charAt(i);
            System.out.println(s.charAt(i)+" "+sum);
        }
        char a='a';
        int as='b';
        List<String> result=new ArrayList<>();
        result.add("Ashish");
        System.out.println(result);
        System.out.println(as);
        int ascii=a;
        System.out.println("here"+ascii);

        // for(int i=0;i<res.length();i++){
        //     if(s.charAt(i).equals("A")){

        //     }
        //     System.out.println(res.charAt(i));

        // }
    }
}