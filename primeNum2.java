import java.util.Scanner;
public class primeNum2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Starting of Prime Num :");
        int start=sc.nextInt();
        System.out.println("Ending of Prime Num :");
        int end=sc.nextInt();
      //  int 
        for(int i=start;i<=end;i++){
            boolean isPrime=true;
            for(int j=2;j<=Math.sqrt(start);j++){
                if(start%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
            start++;
        }

    }

    
}
