public class mergesort2 {
   static void merge(int[] num,int st,int mid,int end){
        int[] temp=new int[end-st+1];
        int i=st, j=mid+1;int idx=0;
        while(i<=mid &&j<=end){
            if(num[i]<=num[j]){
                temp[idx++]=num[i];
                i++;
            }else{
                temp[idx++]=num[j];
                j++;
            }

        }
        while(i<=mid){
            temp[idx++]=num[i];
            i++;
        }
        while(j<=end){
            temp[idx++]=num[j++];     
           }
        for(int k=0;k<temp.length;k++){
            num[k+st]=temp[k];
        }


    }

     static void mergesort(int[] num,int st,int e){
        if(st<e){
            int mid=st+(e-st)/2;
            mergesort(num,st,mid);
            mergesort(num,mid+1,e);
            merge(num,st,mid,e);
        }
    }
    public static void main(String[] args){
        int[] arr={2,1,4,3,7,5,6};
        int len=arr.length;
        mergesort(arr,0,len-1);
        for(int i:arr){
            System.out.print(i);
        }
        // for()
    }
    
}
