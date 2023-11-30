  public void Delete_At_Position(int k) {
        if (head == null) {
            return;
        }
        int ct = 1;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            ct++;
        }
        if (k == 1) {
            Delete_At_Begining();
            return;
        } else if (k == ct) {
            Delete_At_end();
            return;
        } else if (k > 0 && k < ct) {
            temp = head;
            for (int i = 1; i < k-1 ; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;


        } else {
            System.out.println("Invalid index");
        }
    }
