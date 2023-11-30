   void print(){
        Node_DLL temp=head;
        int ct=0;
        if(head==null){
            System.out.println("No elements in Linked list");
            return;
        }
        while(temp.next!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
            ct++;
        }
        ct++;
        System.out.print(temp.data+" ");
        System.out.println("The total elements  in linked list are "+ct);
    }
