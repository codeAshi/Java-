import java.util.*;
public class pr5 {
    public static void main(String[] args){
        LinkedList<Integer> nums=new LinkedList<>();
        // nums.add(12);
        // // nums.removeFirst();
        // nums.add(13);
        // nums.add(14);
        // nums.add(15);
        // System.out.println(nums);
        // System.out.println(nums.peekLast());
        // System.out.println(nums.peek());
        // nums.removeFirst();
        // nums.removeLast();
        // System.out.println(nums);
        int [] num={1,3,-1,-3,5,3,6,7};
        nums.add(num[0]);
        for (int j=0;j<num.length-3;j++){
        for(int i=j;i<j+3;i++){
            if(num[i]>nums.peekFirst()){
                // nums.pop();
                nums.add(num[i]);
                System.out.println(nums);
            }

        }

        }
        System.out.println(nums.size());
        System.out.println(nums);
        
    }
    
}
