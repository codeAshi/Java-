public class mergesort {
    static int  factorial(int i){
        if(i==0){
            return 1;
        }
        return i*factorial(i-1);
    }
    public static void main(String[] args){

        System.out.print(factorial(5));

    }
    
}
