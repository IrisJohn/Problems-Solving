class Solution {
    public int maxSubArray(int[] nums) {
        //int sum[]=new int[nums.length];
        //sum[0]=nums[0];
     int max1=Integer.MIN_VALUE; 
        int max2=0;
   for(int i=0;i<nums.length;i++)
   {
       max2=max2+nums[i];
       if(max1<max2)
           max1=max2;
       if(max2<0)
           max2=0;
}
        return max1;
    }
}