import java.util.*;
class linkedList6{
    public static void main(String[] args){
        LinkedList<Integer> nums=new LinkedList<>();
        ArrayList<String> names=new ArrayList<>();
        Queue<Integer> clas=new LinkedList<>();
        Stack<Integer> rolls=new Stack<>();
        Queue<Integer> student=new PriorityQueue<>();
        rolls.add(100);
        rolls.add(200);
        rolls.add(300);
       student.addAll(Arrays.asList(1,2,3,4,5,76,8));
       System.out.println(student);

        System.out.println(rolls);
         rolls.pop();
         System.out.println(rolls);
        clas.add(10);
        clas.add(20);
        clas.add(30);
        System.out.println(clas.peek());
        System.out.println(clas.size());
        System.out.println(clas.poll());
        System.out.println(clas);

        nums.addAll(Arrays.asList(1,2,3,4,6));
        System.out.println(nums);
        names.addAll(Arrays.asList("Bedar","Ashish","Bhaskar"));
        System.out.println(names);

        for(int i:nums){
            System.out.println(i);
        }

    }
}