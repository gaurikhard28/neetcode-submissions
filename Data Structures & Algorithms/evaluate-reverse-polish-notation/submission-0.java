class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        //  int ans=0;

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*")
                || tokens[i].equals("/")) {
                int left = st.pop();
                int right = st.pop();
                switch (tokens[i]) {
                    case "+":
                        st.push(left + right);
                        break;
                    case "-":
                        st.push(right - left);
                        break;
                    case "*":
                        st.push(left * right);
                        break;
                    case "/":
                        st.push(right / left);
                        break;
                }
            } else {
                st.push(Integer.parseInt(tokens[i]));
            }
        }

        return st.pop();
    }
}
