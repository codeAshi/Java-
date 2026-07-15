class node1{
    int data;
    node1 left;
    node1 right;
    node1(int i){
        this.data=i;
        left=right=null;
    }
}
public class tree {
    node1 head;
    void insertroot(int i){
        node1 n=new node1(i);
        head=n;
    }
    void insertNode(int i){
        node1 temp=head;
        while(temp!=null){
            if(i<temp.data){
                temp=temp.left;
            }
            if(i>temp.data){
                temp=temp.right;
            }
        }
         node1 n=new node1(i);
        if(i<head.data){
            temp.left=n;
        }
        if(i>head.data){
            temp.right=n;
        }
       
       
    }
    void display(){
    node1 temp=head;

    while(temp!=null){
        System.out.println(temp.data);
        temp=temp.left;
    }
    }
    public static void main(String[] args){
        tree t=new tree();
        t.insertroot(8);
        float k=0.1f;
        float s=0.2f;
        float res=k+s;
        System.out.println(res);
        // t.display();
        // t.insertNode(3);
        // t.display();

    }
}
