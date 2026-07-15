public class insertionSort {
    public static void main(String[] args){
        int[] nums={4,3,1,6,5,2};

        // step 1: assume the first element is sorted 
        // step 2: place the second element on the Correct Position
        // step 3: continue this process until array get sorted

        int index=0;

        for(int i=1;i<nums.length;i++){
            int key=nums[i];
            int j=i-1;

            while(j>=0&&nums[j]>key){
                nums[j+1]=nums[j];
                j--;
            }

            nums[j+1]=key;
             
        }
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
    
}
