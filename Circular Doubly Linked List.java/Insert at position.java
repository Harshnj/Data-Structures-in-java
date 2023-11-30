 void insert_at_position(int ell, int k){
        Node_CDLL p1= new Node_CDLL(ell);
         Node_CDLL last=head;
         int ct=0;
         while(last.next!=head){
             last=last.next;
             ct++;
         }
         if(k==0){
             insert_at_begin(ell);
         }
         else if(k==ct){
             insert_at_end(ell);
         }
         else if(k>0 && k < ct){
             Node_CDLL temp=head;
             for(int i=0;i<k-1;i++){
                 temp=temp.next;
             }
             p1.next=temp.next;
             temp.next.prev=p1;
             temp.next=p1;
             p1.prev=temp;



         }
         else{
             System.out.println("Invalid position");
         }
     }
