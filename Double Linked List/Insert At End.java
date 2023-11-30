   void insert_end(int ele) {
        Node_DLL p1 = new Node_DLL(ele);
        if (head == null) {
            head = p1;
            p1.next = null;
            p1.prev = null;
        } else {
            Node_DLL temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = p1;
            p1.prev = temp;
            p1.next = null;
        }
    }
