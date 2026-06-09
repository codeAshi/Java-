import java.util.Scanner;
public class primeNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int start=1;
        int end=sc.nextInt();
        System.out.print("Prime Number from 0 to "+end+"\n");
        for (int i=0;i<end;i++){
            boolean isPrime=true;
            for (int j=2;j<=Math.sqrt(start);j++){
                if(start%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(start);
            }
            start++;
        }
        
    }
}