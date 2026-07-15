public class selectionSort {
    public static void main(String[] args){
        int[] nums={2,4,1,7,5,3};
        // Selection sort
        //step 1 : find the minimum form the Array
        int min=Integer.MAX_VALUE;
        int sort=0;
        int key=0;
        
        while(sort<nums.length){
            for(int i=sort;i<nums.length;i++){
            if(nums[i]<min){
                key=i;
            }
            min=Math.min(nums[i],min);
        }
        int temp=nums[sort];
        nums[sort]=nums[key];
        nums[key]=temp;
        sort++;

        }
        for(int i:nums){
            System.out.print(i+" ");
        }
        // System.out.println(min);
        // System.out.println(key);
    }
    
}
