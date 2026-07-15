public class mergesort2 {
   static void merge(int[] num,int st,int mid,int end){
        int[] temp=new int[num.length];
        int i=st, j=mid+1;int idx=0;
        while(i<=j&&j<=end){
            if(num[i]<=num[j]){
                temp[idx++]=num[i];
                i++;
            }else{
                temp[idx++]=num[j];
                j++;
            }

        }
        while(i<mid){
            temp[idx++]=num[i];
            i++;
        }
        while(j<end){
            temp[idx++]=num[j];        }
            for(int k:temp){
                System.out.println(k);
            }

    }

     static void mergesort(int[] num,int st,int e){
        if(st<e){
            int mid=st+(e-st)/2;
            mergesort(num,0,mid);
            mergesort(num,mid+1,e);
            merge(num,0,mid,e);
        }
    }
    public static void main(String[] args){
        int[] arr={2,1,4,3,7,5,6};
        int len=arr.length;
        mergesort(arr,0,len-1);
        // for(int i:arr){
        //     System.out.println(i);
        // }
        // for()
    }
    
}
