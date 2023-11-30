 void insert_position(int ele, int k) {
        Node_DLL p1 = new Node_DLL(ele);
        boolean flag=false;
        int ct = 0;
        Node_DLL temp = head;
        while (temp.next != null) {
            temp = temp.next;
            ct++;
        }
        if(k==0){
            flag=true;
            insert_begin(ele);
        }
        else if(k ==  ct){
            flag=true;
            insert_end(ele);
        }
       else if(k>0 && k<=ct){
             temp=head;
            for(int i=0;i<k-1;i++){
                temp=temp.next;
            }
            p1.next=temp.next;
            p1.prev=temp;
            temp.next=p1;


        }
        else{
            System.out.println("Invalid Index");
        }


}
