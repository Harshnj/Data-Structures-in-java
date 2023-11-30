 void Delete_At_end() {
        if (head == null)
            return;

        else if (head.next == null) {
            head = null;
        }
        else{
            Node_DLL curr=head;
            while(curr.next.next!=null){
                curr=curr.next;
            }
            curr.next=null;
        }

    }
