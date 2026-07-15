public class mergesort3 {
    void quickSort(int[] nums,int s,int e){
        if(s>=e){
            return;
        }
        int pivot=s;
        int start=s+1;
        int end=e;
        while(start<=end){
            while(start<=end&&nums[start]<=nums[pivot]){
                start++;
            }
            while(end>=start&&nums[end]>=nums[pivot]){
                end--;
            }
            if(start<end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
            }
        
        }
         int temp=nums[pivot];
         nums[pivot]=nums[end];
         nums[end]=temp;
         quickSort(nums,s,end);
         quickSort(nums,end+1,e);
    }
    public static void main(String[] args){
        int[] num={3,5,1,6,2,4};
        System.out.println(num);
        for(int i:num){
            System.out.print(i);
        }
        mergesort3 ob=new mergesort3();
        System.out.println("");
        ob.quickSort(num,0,num.length-1 );
        for(int i:num){
            System.out.print(i);
        }
    }

    
}
