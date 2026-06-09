import java.util.Scanner;
class MatricsSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //System.out.println(n);
        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("Enter Value for Matrics :");
                int temp=sc.nextInt();
                mat[i][j]=temp;
            }

        }
        System.out.println("Completed");
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}