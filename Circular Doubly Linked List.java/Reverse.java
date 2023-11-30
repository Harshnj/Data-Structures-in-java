    void reverse() {
        if (head == null) {
            return;
        }

        Node_CDLL temp = head;
        int ct = 0;
        do {
            temp = temp.next;
            ct++;
        } while (temp != head);

        Node_CDLL tail = temp.prev;

        temp = head;
        head = tail;
        tail = temp;

        Node_CDLL after;
        Node_CDLL before = null;

        for (int i = 0; i <= ct; i++) {
            after = temp.next;
            temp.next = before;
//            temp.prev = after;  // Fix the prev pointer as well
            before = temp;
            temp = after;
        }
    }
