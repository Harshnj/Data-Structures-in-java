 void delete_at_end() {
        if (head == null) {
            return;
        } else if (head.next == head) {
            head = null;
        } else {
            head.prev = head.prev.prev;
            head.prev.next = head;
        }
    }
