class Quicksort2{
    void quicksort(int[] nums,int start,int end){
        if(start>=end){
            return;
        }
        int pivot=start;
        int max=start+1;
        int min=end;
        while(max<=min){
            while(max<=end&&nums[max]<=nums[pivot]){
                max++;
            }
            while(min>=max && nums[min]>=nums[pivot]){
                min--;
            }
            if(max<min){
                int temp=nums[min];
                nums[min]=nums[max];
                nums[max]=temp;
            }
        }
        int temp=nums[pivot];
        nums[pivot]=nums[min];
        nums[min]=temp;
        quicksort(nums,start,min-1);
        quicksort(nums,min+1,end);
    }
    public static void main(String[] args){
        int[] nums={4,2,6,7,3,5};
        for(int i:nums){
            System.out.print(i);
        }
        System.out.println(" ");
        Quicksort2 quicky=new Quicksort2();
        quicky.quicksort(nums,0,nums.length-1);
        for(int i:nums){
            System.out.print(i);
        }
    
    
    
    }
}