public class bubbleSort {
    public static void main(String[] args){
        int[] nums={5,3,8,4,6};
        // step 1: campare the adjcent element 
        // step 2: swap them in the correct location
        // step 3: Follow this until the array get Sorted
         int index=0;
        while(index<nums.length){
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]>nums[i+1]){
                    int temp=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                }
            }
            index++;
        }



        for(int i:nums){
            System.out.print(i+" ");
        }
    }
    
}
