import java.util.Scanner;
class split1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // String m=sc.nextLine();
        // String n=sc.nextLine();
        // // String[] nums=m.split("");
        // String[] nums2=n.trim().split("\\s+");
        // // for(String s:nums){
        // //     System.out.println(s);
        // // }
        // for(String k:nums2){
        //     System.out.println(k);
        // }
        // int s=sc.nextInt();
        
        // int[] ar=new int[s];
        // for (int i=0;i<s;i++){
        //     ar[i]=sc.nextInt();


        // }
        // for(int i:ar){
        //     System.out.print(i);
        // }
        // System.out.print(s);

        int s=sc.nextInt();
        int[][] nums=new int[s][s];
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                nums[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
    }
}