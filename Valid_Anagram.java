import java.util.*;
public class Valid_Anagram {
    public static void main(String[] args){
        char[] a={'s','g','a'};
        char[] b={'a','g','s'};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);

        }
        System.out.println(Arrays.equals(a,b));
        System.out.println("HEre my Dear");

        int[] nums={1,2,1,3,2,4,5};
        int end=nums.length-1;
       Arrays.sort(nums);
       for(int i=end;i>=0;i--){
        if(i==end||nums[i]!=nums[i+1]){
            System.out.println(nums[i]);
        }
       }

        
    }
    
}
