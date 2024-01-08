import java.util.Stack;
//Overflow = When the Stack is full and when we try to insert a element(push) Overflow will occur , Stack can be full when Acutual memory of system is full or size of stack is fixed
//underflow = // When we try to pop or peek in a Empty stack then EmptyStackEception will Occur
public class Stack_Underflow_OverFlow {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<Integer>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        while(!st.isEmpty()){
            System.out.println(st);
            st.pop();
        }
        System.out.println(st);//Now the stack is Empty
        System.out.println(st.pop());// When we try to pop or peek in a Empty stack then EmptyStackEception will Occur
    }
}
