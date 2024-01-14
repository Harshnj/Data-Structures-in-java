import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> qe = new LinkedList<Integer>();

    public MyStack() {

    }

    public void push(int x) {
        qe.add(x);

    }

    public int pop() {
        for(int i=1;i<=qe.size()-1;i++){
            qe.add(qe.remove());
        }
        int x=qe.remove();
        return x;


    }

    public int top() {
        for(int i=1;i<=qe.size()-1;i++){
            qe.add(qe.remove());
        }
        int x=qe.peek();
        qe.add(qe.remove());
        return x;

    }

    public boolean empty() {
        if(qe.size()==0)
            return true;
        else
            return false;
    }
}


