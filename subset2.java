import java.util.*;
public class subset2 {
    void helper(int[] nums,List<Integer> p,List<List<Integer>> res,int i){
        if(i==nums.length){
            res.add(new ArrayList<>(p));
            return ;

        }
        // include i
        p.add(nums[i]);
        helper(nums,p,res,i+1);
        
        // exclude
        p.remove(p.size()-1);
        helper(nums,p,res,i+1);

    }

    public static void main(String[] args){
        int[] nums={1,2,3};
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        subset2 obj= new subset2();
        obj.helper(nums,temp,res,0);
        System.out.println(res);



        // temp.add(1);
        // temp.add(2);
        // res.add(temp);
        // System.out.println(temp);
        // System.out.println(res);
        // temp.add(3);
        // temp.add(4);
        // res.add(temp);
        // System.out.println(res);

    }
    
}
