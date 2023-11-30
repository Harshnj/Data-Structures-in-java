void Delete_at_position(int k){
        if(head==null){
            return;
        }
        int ct=0;
        Node_DLL temp=head;
        while(temp.next!=null){
            temp=temp.next;
            ct++;
        }
        if(k==0){
            Delete_AT_Begin();
            return;
        }
        else if(k==ct){
            Delete_At_end();
            return;
        }
        else if(k>0 && k<ct){
            temp=head;
            for(int i=0;i<k-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            temp.next.prev=temp;


        }
        else{
            System.out.println("Invalid index");
        }
    }
