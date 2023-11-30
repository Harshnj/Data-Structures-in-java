void insert_begin(int ele) {
        Node_DLL p1 = new Node_DLL(ele);
        if (head == null) {
            head = p1;
            p1.next = null;
            p1.prev = null;
        } else {
            p1.next = head;
            head.prev = p1;
            p1.prev = null;
            head = p1;
        }
  }
