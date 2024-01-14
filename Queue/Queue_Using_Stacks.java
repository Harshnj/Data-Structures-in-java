import java.util.Stack;
class MyQueue {
    Stack<Integer> st = new Stack<Integer>();
    Stack<Integer> rt = new Stack<Integer>();

    public MyQueue() {

    }

    public void push(int x) {
        st.push(x);
    }

    public int pop() {
        while(!st.isEmpty()){
            rt.push(st.pop());
        }
        int x= rt.pop();
        while(!rt.isEmpty()){
            st.push(rt.pop());
        }
        return x;

    }

    public int peek() {
        while(!st.isEmpty()){
            rt.push(st.pop());
        }
        int x= rt.peek();
        while(!rt.isEmpty()){
            st.push(rt.pop());
        }
        return x;
    }

    public boolean empty() {
        if(st.size()==0)
            return true;
        else
            return false;

    }
}

