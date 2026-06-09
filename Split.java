import java.util.Scanner;
public class Split {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        // String a=sc.nextLine();
        
        // String [] nums=a.split(" ");
        // for (int i=0;i<nums.length;i++){
        //     System.out.println(nums[i]);
//}
        int[] nums={22,12,14,15,66,5};
        int c=0;
       // System.out.println(nums[c].length);
        while(c<nums.length){
         int temp=nums[c];
         int k=0;
         while(temp>0){
            int temp2=temp%10;
            System.out.println(temp2);
            temp=temp/10;
            k++;
         }
         
            c++;
        }
    }
}
