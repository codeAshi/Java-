import java.util.Scanner;
public class split2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] id=new int[len];
        String[] product=new String[len];
        for(int i=0;i<len;i++){
            id[i]=sc.nextInt();
            product[i]=sc.next();
        }
        int search=sc.nextInt();
        for(int i=0;i<len;i++){
            if(id[i]==search){
                System.out.println(product[i]);
            }
        }
    }
    
}
