class Solution {
     Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    int temp;
    public int climbStairs(int n) {
        
    
        if(map.containsKey(n))
        {
            return map.get(n);
        }
        if(n==2 )
        {
            return 2;
        }
        if(n==1)
        {
            return 1;
        }
        temp = climbStairs(n-1)+climbStairs(n-2);
        map.put(n,temp);
        return temp;
        
    }
}