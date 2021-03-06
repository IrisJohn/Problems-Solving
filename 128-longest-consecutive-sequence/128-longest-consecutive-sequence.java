class Solution {
    public int longestConsecutive(int[] nums) {
        Set < Integer > hashSet = new HashSet < Integer > ();
        for (int num: nums) {
            hashSet.add(num);
        }

        int l = 0;

        for (int num: nums) {
            if (!hashSet.contains(num - 1)) {
                int c = num;
                int ck = 1;

                while (hashSet.contains(c + 1)) {
                    c += 1;
                    ck += 1;
                }

                l = Math.max(l, ck);
            }
        }

        return l;
        
    }
}