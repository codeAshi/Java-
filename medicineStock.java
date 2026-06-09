import java.util.Scanner;
public class medicineStock {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int full=0;
        int half=0;
        int out=0;

        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            String[] id=s.split(" ");
            if(id[1].equals("2")){
                full++;
            }
            else if(id[1].equals("1")){
                half++;
            }
            else {
                out++;
            }
        }
        System.out.println("Full :"+full);
        System.out.println("Half :"+half);
        System.out.println("Out :"+out);
        if(out>0){
            System.out.println("Reorder Required");

        }else{
            System.out.println("Stock is Sufficient");
        }
    }
    
}
