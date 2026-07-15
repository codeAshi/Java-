public class oddnum {
    int recur(int i,int count,int j){
        if(count==j){
            return i;
        }
        // count++;
        
        return i+recur(i+2,count+1,j);
        }
    int oddn(int n){
            if(n==1){
                return 2;

            }
            return n*2+oddn(n-1);
        }
    public static void main(String[] args){
        int n=10;
        oddnum ob=new oddnum();
        System.out.print(ob.recur(1,1,n));
        System.out.println("\n"+ob.oddn(10));

    }
}
