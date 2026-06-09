import java.util.*;
public class duplicateArr {
    public static void main(String[] args){
        int[] nums1={1,2,2,3};
        int[] nums2={2,2};
        int[] nums3=new int[4];
            HashSet<Integer> inter=new HashSet<>();
        int count=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    nums3[count]=nums1[i];
                    inter.add(nums1[i]);

                    count++;
                }
            }
        }
        int count2=0;
        for(int i=1;i<nums3.length;i++){
            if(nums3[i-1]==nums3[i]){
                count--;
            }
        }
int[] arr=new int[count];
int index=0;
for(int i=0;i<nums3.length-1;i++){
    if(nums3[i]!=nums3[i+1]){
        arr[index]=nums3[i];
        index++;
    }
}
for(int i:arr){
    System.out.println(i);
}
        System.out.println(count);
    
        // inter.add(10);
        // inter.add(12);
        // inter.add(10);
        System.out.println(inter);
        String s="1";
        s=s+Integer.toString(2);
        System.out.println(s);
    }
}
