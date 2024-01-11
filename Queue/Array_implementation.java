class arrayy {
    int[] arr = new int[10];
    int ft=-1;
    int rt = -1;
    int size = 0;

    void add(int n) {
        if (isfull()) {
            System.out.println("Queue is Full");
            return;

        }
        if (ft == -1) {
            ft = 0;
            rt = 0;
            arr[rt] = n;
            size++;

        } else {
            arr[++rt] = n;
            size++;
        }
    }

    void delete() {
        if (size==0) {
            System.out.println("Queue is Empty");
            return;
        }
        ft++;
        System.out.println("The delete element is " + arr[ft - 1]);
        size--;
    }

    void peek() {
        System.out.println("The top element is " + arr[ft]);
    }

    boolean isempty() {
        return ft == -1;
    }

    boolean isfull() {
        return rt == arr.length - 1;
    }

    public void display() {
        if(isempty()){
            System.out.println("Queue is empty");
        }
        else{
            for(int i=ft;i<=rt;i++){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}
 class Array_Implemenatation {
    public static void main(String[] args) {
        arrayy qe = new arrayy();
        qe.display();
        qe.add(1);
        qe.display();
        qe.add(2);
        qe.add(3);
        qe.add(4);
        qe.add(5);
        qe.add(6);
        qe.add(7);
        qe.add(8);
        qe.add(9);
        qe.add(10);
        qe.display();
        qe.add(11);
       for(int i=0;i<10;i++){
           qe.delete();
       }
        qe.delete();

    }
}
