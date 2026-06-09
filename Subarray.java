class Subarray{
    public static void main(String[] args){
        int[] arr={-2,-1};
        int len=arr.length;
        int s=0;
        int e=len-1;
        // while(s<e){

        // }


        int maxSum=Integer.MIN_VALUE;
        for(int start=0;start<len;start++){
           
            for (int end=start;end<len;end++){
                int tempSum=0;
                for (int i=start;i<=end;i++){
                System.out.print(arr[i]);
                tempSum=tempSum+arr[i];
                maxSum=Math.max(maxSum,tempSum);
                }
                System.out.print(" ");

            }
            System.out.println();
        }
        System.out.println(maxSum);
    }
}