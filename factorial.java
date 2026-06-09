public class factorial {
    int fact(int a){
        if(a==0){
            return 1;
        }
        return a*fact(a-1);
    }
    
    public static void main(String[] args){
        int fa=1;
        for(int i=1;i<=5;i++){
            fa=fa*i;


        }
        int i=1/2;
        System.out.println(i+"here");
        System.out.println(fa);
        factorial ob=new factorial();
        // ob.fact(5);
        System.out.println(ob.fact(5));

    }
}
