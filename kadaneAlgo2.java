public class kadaneAlgo2 {
    public static void main(String[] args){
        int [] num3={-2, 1,-3, 4, -1, 2, 1, -5, 4};
        int[] num={1,2,3,4,-5};
        int sum=Integer.MIN_VALUE;
        int [] num2=new int[num.length];
        int count=0;
        int temp=0;
        int start=0;
        int end=0;
        int tempstart=0;

        for(int i=0;i<num.length;i++){
            temp=temp+num[i];
            // sum=Math.max(sum,temp);
            if(temp>sum){ 
                sum=temp;
                start=tempstart;
                end=i;// Getting Ending index of array
            }
            if(temp<0){
                tempstart=i+1;//getting Staring index of an Array 
                temp=0;
            }
            //  System.out.println(sum);
        }
        System.out.println(sum);
        System.out.println("SubArray");
        for(int i=start;i<=end;i++){
            System.out.print(num[i]+",");
        }

    }
    
}
