class Node {
    int data;
    Node next;
    public Node(int n){
        this.data=n;
        this.next=null;
    }

}
class stacks{
Node head= null;
int size=0;

    void push(int n){
       if(head==null){
        Node n1=new Node(n);
        head=n1;
        size++;
    }
       else{
           Node n1=new Node(n);
           n1.next=head;
           head=n1;
           size++;
       }


}

void peek(){
    System.out.println(head.data);
    }

    void pop(){
        if(isEmpty()){
            System.out.println("Satck is Empty");
            return;
        }
        System.out.println("The element to be poped is="+head.data);
        head= head.next;
        size--;
    }

    boolean isEmpty(){
        if(size==0)
            return true;
        return false;
    }

    void size(){
        System.out.println("The size of stack is="+size);
    }

    void print_Reverse(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print  (temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    void print_recrusivlery(){
        display(head);
    }
    void display(Node h){
        if(h==null) return;
        else{
            display(h.next);
            System.out.print(h.data+" " );
        }
    }

}

public class Linked_List_implementation {
    public static void main(String[] args) {
        stacks st=new stacks();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.print_recrusivlery();
        System.out.println();
        System.out.println("reverse=");
       st.print_Reverse();
       st.size();
       st.peek();
       st.pop();
       st.pop();
       st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.print_Reverse();
        st.print_recrusivlery();

    }

}
