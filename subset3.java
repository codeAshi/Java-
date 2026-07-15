import java.util.*;
public class subset3 {
    void subset(int[] nums,List<Integer> res,int i){
        if(i==nums.length){
            System.out.println(res);
            return ;
        }
        res.add(nums[i]);
        subset(nums,res,i+1);
        res.remove(res.size()-1);
        int idx=i+1;
        while (idx<nums.length&&nums[idx]!=nums[idx-1]){
            idx++;
        }
        subset(nums,res,idx);
    }
    public static void main(String[] args){
        int[] arr={1,2,3 ,3,3,1,2};
        Arrays.sort(arr);
        List<Integer> res= new ArrayList<>();
        // System.out.println(res);
        subset3 obj=new subset3();
        obj.subset(arr,res,0);


    }
    
}
