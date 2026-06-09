import java.util.*;
public class priorityQueue1 {
    //Binary Search
    int BinarySearch(int[] arr,int target,int start,int end){
        
        while(start<=end){
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]<=target){
            return BinarySearch(arr,target,mid+1,arr.length-1);
        }
        else {
            return BinarySearch(arr,target,0,mid-1);
        }}
        return -1;
    }

    public static void main(String[] Args){
        int[] num={1,2,3,4,5,6,7};
        int target=5;
        // int mid=num.length/2;
        priorityQueue1 bs=new priorityQueue1();
        System.out.println(bs.BinarySearch(num,target,0,num.length-1));

    }
    
}
