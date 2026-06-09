import java.util.Scanner;
class tcs2{
    public static void main(String[] args){
        int [] num={1,2,3,4,5,6,7,8,9,10};
        int len=num.length;
        Scanner sc=new Scanner(System.in);
        int index=sc.nextInt();
        if(index>len){
            System.out.println("Invalid Input");
        }
        int last=len-index;
        for(int i=0;i<=len;i++){
            if(i==index-1||i==last){
                System.out.print(num[i]);
                System.out.print(" ");
            }

        }
        sc.close();
        
    }
}