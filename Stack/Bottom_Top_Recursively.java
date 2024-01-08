import java.util.Stack;

public class display_Bottom_to_Top_Recursively {
    static void printInOrder(Stack<Integer> st, int n) {
        if (n >= 0) {
            printInOrder(st, n - 1);
            System.out.print(st.get(n) + " ");
        }

    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        int n = st.size() - 1;
        printInOrder(st, n);
        System.out.println();
        System.out.println(st);//Default will print from bottom to top

    }
}
