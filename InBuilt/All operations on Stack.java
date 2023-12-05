import java.util.Stack;

public class InBuilt {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println("Stack is empty="+st.empty());
        st.push(0);
        st.push(10);
        st.push(20);
        System.out.println(st);
        st.add(2,15);//Normal Indexing
        System.out.println(st);
        System.out.println("Stack is empty="+st.empty());
        System.out.println("10 is present in Stack st at position  "+st.search(10)+"  From Top of Stack");
        Stack <Integer> st2= (Stack<Integer>)st.clone();
        System.out.println("st2 Stack ="+st2);
        System.out.println("Checks if st ans st2 STACKS are equal "+st.equals(st2));
        System.out.println("The top moost element is"+st.peek());
        System.out.println("The Poped Element is "+st.pop());//Print the popped element
        System.out.println("The element at index 1 is "+st.get(1));//Normal Left to right Indexing in this method
        System.out.println("The size of Stack is "+st.size());



    }
}
