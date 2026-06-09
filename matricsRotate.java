import java.util.*;
public class matricsRotate {
    public static void main(String[] args){
        // // int[][] nums={{0,1},{1,1}};
        // int[][] res=new int[2][2];
        // for(int i=0;i<2;i++){
        //     res[i]=nums[i];
        //     System.out.println(res[i]);
        // }
        String[] names={"Ashish","Ashjsh ","Asdksh"};
        Arrays.sort(names);
        HashSet<Character> name=new HashSet<>();
        String s="assish";
        String res="";
        //longest common subsequence
        int left=0;
        int in=0;
        for(int i=0;i<names[0].length();i++){
           if(names[0].charAt(i)!=names[names.length-1].charAt(i)){
            break;
           }
           res=res+(names[0].charAt(i));
        }
        System.out.println(name);
        System.out.println(res);
        int a=123;
        int sum=0;
        while(a!=0){
            int temp=a%10;
            a/=10;
            sum+=temp;
        }
        System.out.println(sum);
    }
}
