import java.util.*;
class binaryint{
    public static void main(String[] args){
        int a=2;
        System.out.println(Integer.toBinaryString(a));
        String b=Integer.toBinaryString(a);
        System.out.println(b);
        int c=Integer.parseInt(b);
        System.out.println(c);
        String s="Ashish Bhaskar Bedare mmm";
        String d="abca";
        String[] name=s.split(" ");

        HashMap<Character,String> map=new HashMap<>();
        for(int i=0;i<d.length();i++){
            if(map.containsKey(d.charAt(i))&&map.get(d.charAt(i))!=name[i]){
                System.out.println("not match");
            }
            // if(){
            //     System.out.println("key fount");
            // }
            map.put(d.charAt(i),name[i]);
        }
        System.out.println(map);

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        // System.out.println(list);
        // System.out.println(list(1));
        list.add(9);
        System.out.println(list);
        for(int i:list){
            System.out.println(i);
        }


        // for(String d:name){
        //     System.out.println(d);
        // }
    }
}