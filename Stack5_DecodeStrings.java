class Solution {
    static String decodeString(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray())
        {
            if(ch==']')
            {
                StringBuilder str = new StringBuilder();
                while(!st.isEmpty() && st.peek()!='[')
                {
                    str.insert(0,st.pop());
                }
                st.pop();
                StringBuilder num = new StringBuilder();
                while(!st.isEmpty() && Character.isDigit(st.peek()))
                {
                    num.insert(0,st.pop());
                }
                int repeat = Integer.parseInt(num.toString());
                
                String decoded = str.toString().repeat(repeat);
                
                for(char c : decoded.toCharArray())
                {
                    st.push(c);
                }
            }
            else
             st.push(ch);
        }
        StringBuilder result = new StringBuilder();
        while(!st.isEmpty())
        {
            result.insert(0,st.pop());
            
        }
        return result.toString();
    }
}
