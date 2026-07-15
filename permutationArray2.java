import java.util.*;
public class permutationArray2 {
    void permu(int[] nums,int idx){
        if(idx==nums.length){
            for(int i:nums){
                System.out.print(i);

            }
            System.out.println("");
            return;
        }
        for(int i=idx;i<nums.length;i++){
            int temp=nums[idx];
            nums[idx]=nums[i];
            nums[i]=temp;
            permu(nums,idx+1);
            int temp2=nums[idx];
            nums[idx]=nums[i];
            nums[i]=temp2;
        }


    } 
    public static void main(String[] args){
        int[] nums={1,2,3};
        System.out.println(Arrays.toString(nums));
        List<Integer> res=new ArrayList<>();

        // res.addAll(Arrays.asList(nums));
                System.out.println(res);
        permutationArray2 obj=new permutationArray2();
        obj.permu(nums,0);
    }
    
}
