class pr6{
    public static void main(String[] args){
        int [] num={3,4,5,6,1};
        for(int i=1;i<num.length;i++){
            if(num[i]<num[i-1]){
                System.out.println(num[i]);
            }
        }

    }}