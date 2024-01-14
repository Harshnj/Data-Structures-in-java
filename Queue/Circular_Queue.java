class array {
    int[] arr = new int[10];
    int ft = -1;
    int rt = -1;
    int size = 0;
    void add(int n) {
        if (isfull()) {
            System.out.println("Queue is full");
            return;
        }

        if (isempty()) {
            ft = 0;
            rt = 0;
            arr[0] = n;
            size++;
        } else if (rt < arr.length - 1) {
            arr[++rt] = n;
            size++;
        } else {
            rt = 0;
            arr[rt] = n;
            size++;
        }
    }



    void delete() {
        if (size==0) {
            System.out.println("Queue is Empty");
            return;
        }
        int item = arr[ft];
        ft = (ft + 1) % arr.length;
        size--;
        System.out.println("The delete element is " + item);
    }

    void peek() {
        System.out.println("The top element is " + arr[ft]);
    }

    boolean isempty() {
        return size==0;
    }

    boolean isfull() {
        return size==arr.length;
    }

    public void display() {
        if (isempty()) {
            System.out.println("Queue is empty");
        } else if (ft <= rt) {
            for (int i = ft; i <= rt; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            for (int i = ft; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = 0; i <= rt; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

}
public class CircularQueue {
    public static void main(String[] args) {
        array qe=new array();
        qe.display();
        qe.add(1);
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
        qe.add(10);
        qe.delete();
        qe.delete();
        qe.delete();
        qe.display();
        qe.add(11);
        qe.add(12);
        qe.add(13);
        qe.display();
        qe.add(14);


    }
}
