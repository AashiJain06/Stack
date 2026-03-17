class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(char ch : s.toCharArray())
        {
            if(ch==')')
            {
                if(st.size()>1)
                 ans.append(ch);
            
            st.pop();
            }
          else
          {
            if(!st.empty())
            {
                ans.append(ch);
            }
            st.push(ch);
          }
        }
    return ans.toString();
    }
}
