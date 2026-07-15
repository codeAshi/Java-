import java.util.*;
public class permutationArray3 {
    void permu(int[] nums,List<List<Integer>> res,int idx){
        if(idx==nums.length){
            List<Integer> curr= new ArrayList<>();
            for(int i:nums){
                curr.add(i);
            }
            res.add(curr);

            return;
        }
        for(int i=idx;i<nums.length;i++){
            int temp=nums[idx];
            nums[idx]=nums[i];
            nums[i]=temp;
            permu(nums,res,idx+1);
            int temp2=nums[idx];
            nums[idx]=nums[i];
            nums[i]=temp2;

        }
    }

    public static void main(String[] args){
        int[] nums={1,2,3};
        
        List<List<Integer>> res=new ArrayList<>();
        System.out.println(Arrays.toString(nums));
        permutationArray3 ob= new permutationArray3();
        ob.permu(nums,res,0);
        System.out.println(res);
    }
}
