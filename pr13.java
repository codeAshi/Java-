import java.util.Scanner;
class pr13{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        // String s=sc.nextLine();
        String b=sc.nextLine();
        String[] str=b.split(" ");

        int[] nums=new int[str.length];
        for(int i=0;i<str.length;i++){
            nums[i]=Integer.parseInt(str[i]);
            if(str[i].equals("23")){
                System.out.println("hi");
            }
            // System.out.println(v);
        }
        for(int i:nums){
            System.out.println(i);
            if(i==23){
                System.out.println("hello");
            }
        }
        // s.trim();
        // System.out.println(s);
        // String[] a=s.trim().split("\\s+");
        // for(String f:a){
        //     System.out.println(f);
        // }
        }
}