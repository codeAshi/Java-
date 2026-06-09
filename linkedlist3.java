class node{
    int val;
    node next;
    node(int i){
        this.val=i;
        this.next=null;
    }
    node(int i,node next){
        this.val=i;
        this.next=next;
    }
}

public class linkedlist3 {
    node start;
    void add(int n){
         node k=new node(n,start);
        start=k;

    }
    void insertAtLast(int x){
        node n=new node(x);
        node temp=start;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
    }
    void insertAtMiddle(int prev,int x){
        node n=new node(x);
        node temp=start;
        while (temp.val!=prev){
            temp=temp.next;
        }
        n.next=temp.next;
        temp.next=n;

    }
    void delete(int x){
        node temp=start;
        if(temp.val==x){
            start=temp.next;
            return;
        }
        while(temp.next.val!=x){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }

    void printing(){
        node temp=start;
        while(temp!=null){
            System.out.print(temp.val);
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        linkedlist3 n=new linkedlist3();
        n.add(3);
        n.add(4);
        n.insertAtLast(6);
        n.insertAtMiddle(4,5);
        n.printing();
        System.out.println();
        n.delete(6);
        n.printing();


    }
    
}
