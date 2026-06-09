public class tcs3 {
    public static void main(String[] args){
        int[] arr={2,3,4,5,1,2};
        //number of boxes of size 10 

        int len=arr.length;
        int start=0;
        int end=start;
        int weight=10;
        int boxesgroup=0;
        int totalboxes=0;
        int currWeight=0;


        while(start<len){
            if(currWeight+arr[start]<=weight){
                currWeight+=arr[start];
                
          }else{
            boxesgroup++;
        currWeight=arr[start];

          }start++;
          
          

         // System.out.println(currWeight);
        
        

    }
    if(currWeight>0){
        boxesgroup++;
    }
        System.out.println("grouped formed :"+boxesgroup);
        System.out.println("Current weight :"+currWeight);
        System.out.println("node position :"+arr[start-1]);
    }    
}
