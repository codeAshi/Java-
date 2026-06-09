public class stockpr {
    public static void main(String[] args){
        String s="1001 1";
        String[] ar=s.split(" ");
        System.out.println(ar[1].equals("1"));
        for (int i=0;i<2;i++){
            System.out.println(ar[i]);
        }
    }
    
}
