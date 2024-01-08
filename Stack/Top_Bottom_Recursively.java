import java.util.Stack;

public class display_Stack_Recursively {
    static void print_Reverse_Recursive(Stack st){
        int n=st.size();
         if(n>0){
             System.out.println(st.pop());
             print_Reverse_Recursive(st);

         }
    }
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        print_Reverse_Recursive(st);

    }

}
