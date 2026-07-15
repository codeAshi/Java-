import java.util.*;
public class Quicksort3R {
     Random r=new Random();
    void quicksort(int[] nums,int start,int end){
        if(start>=end){
            return;
        }
        int pivot=r.nextInt(start,end);
        int left=start;
        int right=end;
        while(left<=right){
            while(left<=right && nums[left]<=nums[pivot]){
                left++;
            }
            while(right>=left && nums[right]>=nums[pivot]){
                right--;
            }
            if(left<right){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
            }
        }
        int temp=nums[pivot];
        nums[pivot]=nums[right];
        nums[right]=temp;
        quicksort(nums,start,right-1);
        quicksort(nums,right+1,end);
    }
    public static void main(String[] args){
        int[] nums={5,3,2,1,8,6,9};
        int len=nums.length-1;

        for(int i:nums){ System.out.print(i);}
        Quicksort3R obj=new Quicksort3R();
        System.out.println("");
        Random r=new Random();
        int i=r.nextInt(0,6);
        System.out.println(i);
        obj.quicksort(nums,0,len);
        for(int k:nums){
            System.out.print(k);
        }
    }
    
}
