    void recursion(Node_CDLL temp) {
        System.out.println(temp.data);
        if(temp.next!=head){
             recursion(temp.next);

        }

    }
