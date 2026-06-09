class slidingWindow{
    public static void main(String[] args){
        int[] nums={2,5,2,5,3,4,9,2};
        int[] nums2=new int[3];
        for(int i:nums2){
            System.out.println(i);
        }
        int left=0;
        int right=0;
        // int sum=nums[left]+nums[right];
        int PrintSum=0;
        int sum=0;
        for(int i=0;i<3;i++){
            sum+=nums[i];
            right++;
        }
        System.out.println(sum);
        System.out.println(left);
        System.out.println(right);
        while(right<nums.length){
           
            int temp=sum-nums[left]+nums[right];
            
            PrintSum=Math.max(sum,temp);
            sum=temp;
            System.out.println("Current Sum"+temp);
            left++;
            right++;

        }
        System.out.println("max Sum of Three Element "+PrintSum);
        // while()
        // while(left<nums.length-1){
        //     int temp=sum-nums[left]+nums[right+1];
        //     PrintSum=Math.min(temp,sum);
        //     left++;
        //     right++;

        // }
        // int sum2=Integer.MAX_VALUE;
        // for(int i=1;i<nums.length;i++){
        //     int tempSum=nums[i-1]+nums[i];
        //     sum2=Math.min(tempSum,sum);
            
        // }
        // System.out.println(sum2);
    }
}