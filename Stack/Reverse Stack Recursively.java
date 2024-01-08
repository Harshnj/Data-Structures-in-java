    static void reverse_stack_recursively(Stack<Integer> st){
        if(st.size()==1) return;
        {
            int top = st.pop();
            reverse_stack_recursively(st);
            pushatindex(st, top,0);
        }
    }
