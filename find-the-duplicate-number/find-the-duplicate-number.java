class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        Boolean check[]=new Boolean[n];
        Arrays.fill(check, Boolean.FALSE);
      // all the values will be false
        for(int i=0;i<n;i++)
        {
            if(check[nums[i]]==false)
                check[nums[i]]=true;
            else
                return nums[i];
        }
        
    return 1;}
}