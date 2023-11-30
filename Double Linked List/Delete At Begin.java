 void Delete_AT_Begin(){
        if(head == null){
            return;
        }
        else if(head.next==null){
            head=null;
        }
        else{
            Node_DLL temp=head;
            head=head.next;
            head.prev=null;
            temp.next=null;

        }
    }
