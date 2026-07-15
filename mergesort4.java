public class mergesort4 {
    void merge(int[] nums,int start,int mid,int end){
        int[] temp=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int idx=0;
        while(i<=mid && j<=end){
            if(nums[i]<=nums[j]){
                temp[idx++]=nums[i++];

            }else{
                temp[idx++]=nums[j++];
            }
        }
        while(i<=mid){
            temp[idx++]=nums[i++];
        }
        while(j<=end){
            temp[idx++]=nums[j++];
        }
        for(int k=0;k<temp.length;k++){
            nums[k+start]=temp[k];
        }


    }
    void mergesort(int[] nums,int start,int end){
        if(start<end){
            int mid=start+(end-start)/2;
            mergesort(nums,start,mid);
            mergesort(nums,mid+1,end);
            merge(nums,start,mid,end);
        }
    }
    public static void main(String[] args){
        int [] nums={4,2,1,5,6,3,9,8,7};
        for(int i:nums){
            System.out.print(i+" ");
        }
    
    mergesort4 obj=new mergesort4();
    obj.mergesort(nums,0,nums.length-1);
    System.out.println("");
    for(int i:nums){
        System.out.print(i+" ");
    }
    
}}
