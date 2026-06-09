public class maxSumArray {
    public static void main(String[] args){
        int[] arr={-1,2,3,-1,4,5};
        //maximum sum of subarray
        int len =arr.length;
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for (int i=0;i<len;i++){
            currsum+=arr[i];
            maxsum=Math.max(maxsum,currsum);
            if (currsum<0){
                currsum=0;
            }
        }
        System.out.println(maxsum);
    }
    
}
