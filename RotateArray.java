import java.util.Scanner;
class RotateArray{
    static void r(int[] arr,int l,int r){
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};//51234
        int len=arr.length;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       // int n=2;

       // this will rotate the array in left to right
        r(arr,0,len-1);
        r(arr,n,len-1);
        r(arr,0,n-1);

        for(int i:arr){
System.out.print(i);
        }
        // this will rotate the array in right to left
        System.out.println("\n");
        int [] arr2={1,2,3,4,5};
        

        r(arr2,0,n-1);
        r(arr2,n,len-1);
        r(arr2,0,len-1);
        for(int i: arr2){
            System.out.print(i);
        }



sc.close();
    }
}