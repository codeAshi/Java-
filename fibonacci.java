public class fibonacci {
    // recusive fuction for fibonacci
    int fibo(int n){
        if(n==0||n==1){
            return n;
        }
       
        return fibo(n-1)+fibo(n-2);
    }

    // recursive function for array is sorted or not
    boolean isSorted(int[] num,int len){
        if(num[len]==0||num[len]==1){
            return true;

        }
        return num[len-1]>=num[len-2]&&isSorted(num,len-1);

    }
    public static void main(String[] args){

        int[] arr={1,2,3,4,5,6};
        int l=arr.length;
        // fibonacci using  for loop
        int a=0;
        int b=1;
        for(int i=0;i<10;i++){
            System.out.println(a);
            int temp=a;
            a=b;
            b=temp+b;

        }
        fibonacci f=new fibonacci();
        System.out.println(f.isSorted(arr,l));
        System.out.println(f.fibo(7));
    }
    
}
