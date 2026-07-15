class Node{
int data;
Node prev;
Node next;

Node(int val){
    this.data=val;
    prev=next=null;
}
Node(int val,Node n){
    this.data=val;
    this.next=n;
}
Node(Node p,int val,Node n){
    this.prev=p;
    this.data=val;
    this.next=n;
}
}
class DLinkedList{
    Node start;
    void insertAtFirst(int i){
        Node n=new Node(i);
        start=n;
    }
    void insertElement(int i){
        Node temp=start;
        Node n=new Node(i);
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
        n.prev=temp;

    }
    void delete(int i){
        Node temp=start;
        while(temp!=null){
            if(temp.data==i){
                temp.prev.next=temp.next;
                temp.next.prev=temp.prev;
                break;
            }
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Node Not Found");
        }
    }
    void insertAtmiddle(int i,int j){
        Node temp=start;
        while(temp.data==i){
            temp=temp.next;
        }
        Node n=new Node (j);
        
        n.next=temp.next;
        n.prev=temp.prev;

    }
    void search(int i){
        Node temp=start;
        while(temp!=null){
            if(temp.data==i){
            System.out.println(i+" Found previous is "+temp.prev.data);
            break;
        }
            temp=temp.next;
        }
        
    }
    void display(){
        Node temp=start;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;

        }
    }
    public static void main(String[] args){

        DLinkedList DLL=new DLinkedList();
        DLL.insertAtFirst(1);
        DLL.insertElement(2);
        
        DLL.insertElement(3);
        DLL.insertElement(4);
        DLL.insertElement(5);
        DLL.insertElement(6);
        DLL.insertElement(7);
        DLL.display();
       DLL.search(4);
       DLL.delete(4);
       DLL.display();
       DLL.insertAtmiddle(3,4);
       DLL.display();
    }
}