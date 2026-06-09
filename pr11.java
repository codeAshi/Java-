import java.util.*;
class pr11{
    public static void main(String[] args){
        int[] nums={1,1,2,1,1};
        int count=1;
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        int[] num2=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            num2[i]=i+1;

        }
        for(int i:num2){
            System.out.print(i);
        }
        // boolean b=false;
        for(int i=0;i<nums.length;i++){
            while(count<nums[i]){
                list.add(count);
                count++;

            }
            if(count==nums[i]){
                count++;
            }
        }
        while(count<=nums.length){
            list.add(count);
            count++;
        }
        
       // list.add(1);
        // System.out.println(list);
        // for(int i=0;i<nums.length;i++){

        //     if(nums[i]!=count){
        //         list.add(count);
        //         count++;
        //     }else{
        //         count++;
        //     }

        // }
        System.out.println(list);
    }
}