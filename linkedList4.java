class Node {
    int val;
    Node next;
    Node(int i){
        this.val=i;
    }
    Node(int x,Node n){
        this.val=x;
        this.next=n;
    }
}
public class linkedList4 {
    Node start;
    void add(int x){
        Node n=new Node(x,start);
        start=n;
    }
    void RemoveNth(int n){
        Node temp=start;
        int count=0;
        int nth=n-count+1;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        if(count==1){
            start=null;
        }
        Node temp2=start;
        int count2=0;
        while(temp2!=null){
            
            if(count2==nth){
                temp2.next=temp2.next.next;
                break;     
            }
            temp2=temp2.next;
            count2++;
        }
     //   temp2.next=temp2.next.next;
        System.out.println(count );
    }
    void printing(){
        Node temp=start;
        while (temp!=null){
            System.out.print(temp.val);
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        linkedList4 ll=new linkedList4();
        ll.add(7);
        ll.add(6);
        ll.add(5);
        ll.add(4);
        ll.add(3);
        ll.add(2);
        ll.printing();
        System.out.println(" remove");
        ll.RemoveNth(2);
        System.out.println();
        ll.printing();

    }
    
}
