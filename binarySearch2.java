public class binarySearch2 {
    void find(int[] nums,int start,int end,int find){
        if(start>end){
            System.out.println("Element Not Found");
            return;
        }
        // int start=0;

        // int end=nums.length-1;
        int mid=start+(end-start)/2;
        if(nums[mid]==find){
            System.out.println("Element Found");
            return;
            

        }
        if(find<=nums[mid]){
        find(nums,start,mid,find);}
        else{
        find(nums,mid+1,end,find);}
    }
    public static void main(String[] arg){
        int [] nums={1,2,3,5,6,7};
        int find=6;
        int count=0;

        for(int i:nums){
            if(i==find){
                System.out.println("Element Found");
                break;
            }
            count++;
            
        }

        System.out.println("Iterations "+count);
        binarySearch2 ob= new binarySearch2();
        ob.find(nums,0,nums.length-1,6);
    }
    
}
