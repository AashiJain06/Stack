class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] ans = new int[n1];
        Arrays.fill(ans,-1);
        for(int i =0;i<n1;i++)
        {
            boolean flag = false;
            int j=0;
            while(j<n2)
            {
                if(nums2[j]==nums1[i])
                {
                 flag = true;
                 break;
                }
                j++;
            }
            if(flag)
            {
                for(int k =j;k<n2;k++)
                {
                    if(nums2[k]>nums1[i])
                    {
                     ans[i] = nums2[k];
                     break;
                    }
                }
            }
        }
        return ans;
    }
}
