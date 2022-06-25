class Solution {
    public int maxProduct(int[] nums) {
        
        int maxLeft = nums[0];
	    int maxRight = nums[0];
	    
	    boolean zeroPresent = false;
	    
	    int prod = 1;
	    
	    for(int i:nums) {
	        prod *= i;
	        if(i == 0) {
	            zeroPresent = true;
	            prod = 1;
	            continue;
	        }
	        maxLeft = Math.max(maxLeft,prod);
	    }
	    
	    prod = 1;
	    
	    for(int j=nums.length-1;j>=0;j--) {
	        prod *= nums[j];
	        if(nums[j] == 0) {
	            zeroPresent = true;
	            prod = 1;
	            continue;
	        }
	        maxRight = Math.max(maxRight,prod);
	    }
	    
	    if(zeroPresent) return Math.max(Math.max(maxLeft,maxRight),0);
	    return Math.max(maxLeft,maxRight);
}
}