void insert_at_begin(int ele) {
        Node_CDLL temp = head;
        Node_CDLL p1 = new Node_CDLL(ele);
        if (head == null) {
            head = p1;
            head.next = head;
            head.prev = head;

        } else {
            temp = head.prev;
            p1.next = head;
            head.prev = p1;
            head = p1;
            p1.prev = temp;

        }
    }
