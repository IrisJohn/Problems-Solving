class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> a= new HashSet<Integer>();
        for(int elem:nums)
        {
            a.add(elem);
        }
        List<Integer> list = new ArrayList<Integer>(a);
        Collections.sort(list);
        for(int i=0;i<list.size();i++)
        {
            nums[i]=list.get(i);
        }
        return list.size();
    }
}