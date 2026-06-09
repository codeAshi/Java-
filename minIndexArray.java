class minIndexArray{
    static void rotate(int[] n,int left,int right){
        while(left<right){
            int temp=n[left];
            n[left]=n[right];
            n[right]=temp;
            left++;
            right--;

        }
    }
    public static void main(String[] args){
        int[] nums={2,1,3,4};
        int min=Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<nums.length;i++){
          //  int temp=Math.min(min,nums[i]);
            if(nums[i]<min){
                min=nums[i];
                index=i;
            }
        }
        int k=index;
        rotate(nums,0,k-1);
        rotate(nums,k,nums.length-1);
        rotate(nums,0,nums.length-1);
        for(int i:nums){
            System.out.print(i);
        }
        System.out.println();
        System.out.println(index);
        System.out.println(min);
    }
}