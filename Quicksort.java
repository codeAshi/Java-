import java.util.Random;
public class Quicksort {
    public static void QuickSort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int pivot=low;
        int l=low+1;
        int r=high;
        while(l<=r){
            while(l<=r&&arr[l]<=arr[pivot]){
                l++;
            }
            while(r>=l&&arr[r]>arr[pivot]){
                r--;
            }
            if(l<r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
            }
        }
        int temp=arr[pivot];
        arr[pivot]=arr[r];
        arr[r]=temp;
        QuickSort(arr,low,r-1);
        QuickSort(arr,r+1,high);
        
    }
    public static void main(String[] args){
        int[] arr={35,50,15,25,80,20,90,45};
        int pivot=0;
        int l=1;
        int r=arr.length-1;
        // while(l<r){
        //     while(l<=r&&arr[l]<=arr[pivot]){
        //         l++;

        //     }
        //     while(r>=l&&arr[r]>arr[pivot]){
        //         r--;
        //     }
        //     if(l<r){
        //         int temp=arr[l];
        //         arr[l]=arr[r];
        //         arr[r]=temp;
        //     }
            
        // }
        // int temp=arr[pivot];
        // arr[pivot]=arr[r];
        // arr[r]=temp;
        QuickSort(arr,0,arr.length-1);

        for(int i:arr){
            System.out.print(i+" ");
        }
        Random p=new Random();
int d=p.nextInt(0,6);
System.out.println("");
System.out.println(d);

    }
    
}
