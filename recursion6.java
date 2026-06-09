class recursion6  {
    void re(int n){
        if(n==10){
            System.out.print("hello");
            return;
        }
        System.out.println( n);
        re(n+1);
    }

    // factorial formula 
    int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

    // recursion for Sum of N numbers
    int facSum(int n){
        if(n==0){
            return 1;
        }
        return n+facSum(n-1);
    }
    // fibonnacci series 
    int fibo(int i){
       // int n=0;
        if(i==0||i==1){
            return i;
        }
       
        return fibo(i-1)+fibo(i-2);

    }

    boolean isSorted(int[] arr,int l){
        if(arr[0]!=0){
            return true;
        }
        return arr[l-2]<= isSorted(int[] arr,arr[l-1]);

    }
public static void main(String[] args){
    int[] arr={1,2,3,4,5};
recursion6 obj=new recursion6();
obj.re(5);
//obj.factorial(5);
System.out.println();
System.out.print(obj.factorial(5)+"\n");

System.out.println(obj.facSum(10)+"\n");
System.out.println(obj.fibo(8));
}    
}
