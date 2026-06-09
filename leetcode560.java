public class leetcode560 {
    public static void main(String[] args){
        int [] nums={1,2,3};
        int k=3;
        int len=nums.length;
        int count=0;
        int sum=0;
        int start=0;
        int end=0;
        int temsum=0;
        for(int i=0;i<len;i++){
            temsum=temsum+nums[i];
            if(temsum==k){
                temsum-=nums[start];
                start++;
                count++;
            }

        }
        System.out.println(temsum);
        System.out.println(count);
    }
    
}
