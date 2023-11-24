import java.util.Scanner;
class Node{
        int data;
        Node next;

        public  Node(int data) {
             this.data=data;
             this.next=null;
        }

}
    
class LinkedList{
   Node head;
   public void insert_begining(int ele){
       Node p1 = new Node(ele);
       if(head == null){
           head=p1;
       }
       else{
           p1.next=head;
           head=p1;

       }
   }
   public void insert_at_end(int ele){
       Node curr=head;
       Node p1= new Node(ele);
       if(head == null){
           head = p1;
       }

       else{
           curr=head;
           while(curr.next!=null){
               curr=curr.next;
           }
           curr.next=p1;
       }

   }
   public void inser_at_position(int ele,int k){
       Node p1 = new Node(ele);
       Node curr=head;
       if(head==null){
           head = null;
       }
       int c=0;
       Node temp=head;
       while(temp!=null){
           temp=temp.next;
           c++;
       }
       if(k==0){
           insert_begining(ele);
       }
       if(k>0 && k<=c) {
           curr = head;
           int ct = 0;
           while (ct < k - 1) {
               ct++;
               curr = curr.next;

           }
           p1.next = curr.next;
           curr.next = p1;
       }
       else if(k>0)
           System.out.println("Entered Position in invalid, So the element cannot be added.");

   }
   public void insert(int a){
       Node curr;
       Scanner sc = new Scanner(System.in);
       curr=head;
       System.out.println("Enter elements");
       if(head==null){
           int b=sc.nextInt();
           Node p1=new Node(b);
           head=p1;
           curr=head;
           for(int i=1;i<a;i++){
               b=sc.nextInt();
               Node p2 = new Node(b);
               curr.next=p2;
               curr=curr.next;
           }
       }
       else{
           Node temp=head;
           while (temp.next!=null){
               temp=temp.next;
           }
           for(int i=0;i<a;i++){
               int c=sc.nextInt();
               Node p1 = new Node(c);
               temp.next=p1;
               temp=temp.next;
           }

       }
   }
   public void print(){
       int ct=0;
       Node curr=head;
       while(curr.next!=null){
           System.out.print(curr.data+" ");
           curr=curr.next;
           ct++;
       }
       System.out.println(curr.data+" ");
       System.out.println();
       System.out.println("Total elements in Linked list = "+ct);

   }
}


class implement{
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
ll1.insert(5);
ll1.insert_at_position(200,2);
        ll1.print();
    }
}

