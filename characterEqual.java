public class characterEqual {
    public static void main(String[] args){
        char c='c';
        char d='c';
        String text="ashish";
        System.out.println(text.length());
        for(int o=0;o<text.length();o++){
            System.out.print(text.charAt(o));
        }
        System.out.println(text.charAt(1));
        if (c==d){
            System.out.println("correct");
        }else{
            System.out.println("Not Correct");
        }
    }
}
