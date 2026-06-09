import java.util.Scanner;
class String1{
    public static void main(String[] args){
   System.out.print("Type a letter :");
   Scanner sc=new Scanner(System.in);
   String letter=sc.nextLine();
//String a="Dear Ashish,Hello Ananya This side hows Your College Going";
for(int b=0;b<letter.length();b++){
    char c=letter.charAt(b);
    if(c==','||c=='.'){
        System.out.print(c);
        System.out.println();
    }
    else{
        System.out.print(c);
    }

}

        
        
sc.close();
     
    }
}