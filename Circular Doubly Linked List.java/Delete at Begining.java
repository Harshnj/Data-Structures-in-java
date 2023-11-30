void delet_begin() {
        if (head == null) {
            return;
        } else if (head.next == head) {
            head = null;
        } else {
            head = head.next;
            head.prev.prev.next = head;
            head.prev = head.prev.prev;


        }
    }
