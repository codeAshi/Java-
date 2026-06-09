public class kadaneAlgo {
    public static void main(String[] args){
        int[] nums={-1,-2,6,-7,8};
        // maximum Sum of SubArray
        int CurrSum=0;
        int sum=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            CurrSum=CurrSum+nums[i];
            sum=Math.max(sum,CurrSum);
            if(CurrSum<0){
                CurrSum=0;
            }
        }
        System.out.println(sum);
    }
    
}
