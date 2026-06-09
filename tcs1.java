import java.util.Scanner;
public class tcs1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int[][] mat=new int[n][2];
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            String[] temp=s.split("  ");
            int count =0;
            for(int j=0;j<2;j++){
                mat[i][j]=Integer.parseInt(temp[count]);
                count++;

               // System.out.print(mat[i][j]);
            }
           // System.out.println();
        }
        String s=sc.nextLine();
        String[] xy=s.split("  ");
        

        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<2;j++){
                int temo=Integer.parseInt(xy[count]);

                System.out.print(mat[i][j]*temo+ " ");
                count++;
            }
            System.out.print(",");
        }
    }
    
}
