public class SubArray1 {
    public static void main(String[] args){
        int[] num={1,-4,0,4,5};
        // System.out.println(num[0]*num[1]);
        int start=0;
        int len=num.length-1;
        int end=0;
        int max=1;
        
        while(start<=len){
            for(int i=start;i<len;i++){
                int temp=max*num[i];
                max=Math.max(temp,max);
                if(max<=0){
                    max=1;
                    start=i;
                    break;
                }
                end++;
            }
            System.out.println(start);
             start++;
           // end++;
            // if(end==10){
            //     break;
            // }
        }
        System.out.println(max);
    }
    
}
