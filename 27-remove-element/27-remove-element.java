class Solution {
    public int removeElement(int[] nums, int val) {
        
        List<Integer> m = new ArrayList<Integer>();
        for (int elem: nums)
        {
            if(elem!=val)
            {
                m.add(elem);
            }
        }
        for(int i=0;i<m.size();i++)
        {
            nums[i]=m.get(i);
        }
        return m.size();
        
    }
}