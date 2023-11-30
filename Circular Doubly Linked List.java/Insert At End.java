  void insert_at_end(int ele) {
        Node_CDLL temp = head;
        Node_CDLL p1 = new Node_CDLL(ele);
        if (head == null) {
            head = p1;
            p1.next = head;
            p1.prev = head;
        } else {
            temp = head.prev;
            temp.next = p1;
            p1.prev = temp;
            p1.next = head;
            head.prev = p1;
        }

    }
