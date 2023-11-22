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
}

class implement{
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        ll1.insert_begining(50);
    }
}
