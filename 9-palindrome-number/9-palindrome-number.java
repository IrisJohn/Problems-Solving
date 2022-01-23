class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        int k=s.length()-1;
        for(int i=0;i<s.length();i++,k--)
            if(s.charAt(i)!=s.charAt(k))
                return false;
        return true;
        
    }
}