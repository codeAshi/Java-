public class Leetcode3178 {
    public static void main(String[] args){
        int n=3;
        int k=5;
        int count=0;
        boolean res=true;
        for(int i=0;i<k;i++){
            if(res){
                System.out.println(count);
                count++;
            }
            if(!res){
                System.out.println(count);
                count--;
            }
            if(count==n-1){
                res=false;
            }
            if(count==0){
                res=true;
            }
        }
        System.out.println(count+" --final");
    }
}
