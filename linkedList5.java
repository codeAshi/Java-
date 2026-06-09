import java.util.ArrayList;
class Node{
    int val;
    Node next;
     Node(int v){
        this.val=v;
     }
     Node(int v,Node n){
        this.val=v;
        this.next=n;
     }
}
class linkedList5{
    Node start;
    void add(int x){
        Node n=new Node(x,start);
        start=n;


    }
    void insertLast(int x,int v){
        Node temp=start;
        Node n=new Node(v);
        while(temp.val!=x){
            temp=temp.next;

        }
        n.next=temp.next;
        temp.next=n;

        // while(temp.next!=null){
        //     temp=temp.next;
        // }
        
        // temp.next=n;
    }
    void display(){
        Node temp=start;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    void delete(int x){
        Node temp=start;
        while(temp.next.val!=x){
            temp=temp.next;

        }
        temp.next=temp.next.next;
    }
    public static void main(String[] args){
        linkedList5 list=new linkedList5();
        list.add(5);
        list.add(6);
        list.add(7);
         list.add(3);
          list.add(9);
           list.add(1);

        list.insertLast(6,8);
        list.display();
        list.delete(7);
        list.display();
ArrayList<Integer> list2=new ArrayList<>();
list2.add(1);
list2.add(2);
list2.add(3);
list2.add(4);
System.out.println(list2);

    }
}