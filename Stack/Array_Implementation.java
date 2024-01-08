 class stack{
    int arr[]=new int[10];
    int idx=-1;
    void push(int n){
        if(isFull()){
            System.out.println("Stack is Full");
            return;
        }
        idx++;
        arr[idx]=n;
    }

    void peek(){
        System.out.println("The topMost element is="+arr[idx]);
    }

    void pop(){
        if(isempty()){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("The poped item="+arr[idx]);
        arr[idx] = 0;
        idx--;
    }

    boolean isempty(){
        if(idx==-1){
            return true;
        }
        return false;
    }

    boolean isFull(){
        if(idx==arr.length-1){
            return true;
        }
       return false;
    }

    void size(){
        System.out.println("Size of the stack is=" +(idx+1));
    }

    int capacity(){
        return arr.length;
    }

    void print(){
        System.out.print("[ ");
        for(int i=0;i<=idx;i++){
            System.out.print(+arr[i]+" ");
        }
        System.out.print("]");
        System.out.println();
    }


}
public class Array_Implementation {
    public static void main(String[] args) {
       stack st= new stack();
       st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        st.peek();
        st.push(80);
        st.push(90);
        st.print();
        st.size();
        st.push(100);
        st.size();
        st.push(110);
        st.pop();
        st.print();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.print();
        st.pop();
        System.out.println(st.idx);
    }
}
