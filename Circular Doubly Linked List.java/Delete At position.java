 void delet_at_position(int k){
        if(head==null){
            return;
        }
        int ct=0;
        Node_CDLL temp=head;
        while(temp.next!=head){
            temp=temp.next;
            ct++;
        }
        if(k==0){
            delet_begin();
            return;
        }
        else if(k==ct){
           delete_at_end();
            return;
        }
        else if(k>0 && k<ct) {
            temp=head;
            for(int i=0;i<k-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            temp.next.prev=temp;

        }
        }
