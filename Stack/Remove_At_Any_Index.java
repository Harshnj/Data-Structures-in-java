import java.util.Stack;

public class Sttaacckk {
    static void pushatindex(Stack<Integer> st,int n,int k){
        Stack<Integer> rt= new Stack<>();
        while(st.size()>k){
           rt.push(st.pop());
        }
        st.push(n);
        while(rt.size()>0){
            st.push(rt.pop());
        }
    }
    static void remove_at_any_index(Stack<Integer>st,int k){
        Stack<Integer> rt= new Stack<>();
        while(st.size()>k){
            rt.push(st.pop());
        }
        rt.pop();
        while(rt.size()>0){
            st.push(rt.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        pushatindex(st,0,0);
        System.out.println(st);
        remove_at_any_index(st,0);
        System.out.println(st);

    }
}
