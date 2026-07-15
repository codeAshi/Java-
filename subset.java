import java.util.*;
class subset{

    void printSubset(int[] nums,ArrayList<Integer> res,int i){
        if(i==nums.length){
            
                System.out.println(res);
            
            return ;
        }
        //Include Element at i
        res.add(nums[i]);
        printSubset(nums,res,i+1);

        //Exclude Element at i
        res.remove(res.size()-1);
        printSubset(nums,res,i+1);

    }
    public static void main(String[] args){
        int[] arr={1,2,3};
        ArrayList<Integer> res=new ArrayList<>();
        subset obj=new subset();
        obj.printSubset(arr,res,0);

    }
}