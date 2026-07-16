class gcd{
    public static int bounce(int n){
        if(n<=0){
            return 0;
        }
        return n-bounce(n-2);
    }
    int  gcd1(int a,int b){
        if(b==0){
            return a;
        }
        return gcd1(b,a%b);
    }
    public static void main(String[] args){
        int a=4;
        int b=7;
        gcd ob=new gcd();
        System.out.println(ob.gcd1(a,b));
        System.out.println(ob.bounce(7));
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;

        }
        int d=1-2;
        System.out.println(d);
        System.out.println(a);
    }
}