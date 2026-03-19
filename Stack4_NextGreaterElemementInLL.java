class Solution {
    public ListNode reverse(ListNode head)
    {
        ListNode temp = head;
        ListNode front = null;
        ListNode prev = null;
        while(temp!=null)
        {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        head = reverse(head);
        ListNode temp = head;
        while(temp!=null)
        {
            while(!st.isEmpty() && st.peek()<=temp.val)
             st.pop();
            if(st.isEmpty())
             ans.add(0);
            else
            {
                ans.add(st.peek());
            }
            st.push(temp.val);
            temp = temp.next;
        }
        head = reverse(head);
        Collections.reverse(ans);
        int[] array = new int[ans.size()];
        for(int i =0;i<array.length;i++)
        {
            array[i] = ans.get(i);
        }
        return array;
    }
}
