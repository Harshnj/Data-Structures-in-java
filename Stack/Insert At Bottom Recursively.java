static void insert_at_bottom_recursively(Stack<Integer> st, Stack<Integer> rt) {
        if (!st.isEmpty()) {
            // Move elements from st to rt
            rt.push(st.pop());
            insert_at_bottom_recursively(st, rt);
        } else {
            // Push the desired element at the bottom of st
            st.push(25);

            // Move elements from rt back to st
            while (!rt.isEmpty()) {
                st.push(rt.pop());
            }
        }
    }
