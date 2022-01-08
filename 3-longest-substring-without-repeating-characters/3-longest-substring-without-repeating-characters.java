class Solution {
    public int lengthOfLongestSubstring(String s) {
        
       int maxans = Integer.MIN_VALUE;
        if(s.length()==1)
            return 1;
        if(s.isEmpty())
            return 0;
        
           Set < Character > set = new HashSet < > ();
        int l = 0;
        for (int r = 0; r < s.length(); r++) 
        {
            if (set.contains(s.charAt(r))) 
            {
                while (l < r && set.contains(s.charAt(r))) {
                    set.remove(s.charAt(l));
                    l++;
                }
                
            }
            
            set.add(s.charAt(r));
            maxans = Math.max(maxans, r - l + 1);
        }
        return maxans;
        
       
        
    }
}