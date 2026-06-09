import java.util.*;
public class pr12 {
    public static void main(String[] args){
        int[] num={2,2,2,4,5,5};
        List<Integer> list=new ArrayList<>();
        int count=1;
        for(int i=0;i<num.length;i++){
            while(count<num[i]){
                list.add(count);
                count++;

            }
            if(count==num[i]){
                count++;
            }
        }
        while(count<=num.length){
            list.add(count);
            count++;
        }
        System.out.println(list);
    }
    
}
