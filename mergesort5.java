public class mergesort5 {
    void merge(int[] nums,int start,int mid,int end){
        int[] temp=new int[end-start+1];
        int i=start, j=mid+1;
        int idx=0;
        while(i<=mid && j<=end){
            if (nums[i]<nums[j]){
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
    void divide(int[] nums,int start,int end){
        if(start<end){
            int mid=start+(end-start)/2;
            divide(nums,start,mid);
            divide(nums,mid+1,end);
            merge(nums,start,mid,end);
        }
    }
    public static void main(String[] args){
        int[] nums={4,2,5,3,10};
        int len=nums.length;
        for(int i:nums){
            System.out.print(i+" ");
        }
        System.out.println("");
        mergesort5 ob=new mergesort5();
        ob.divide(nums,0,len-1);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
    
}
