class Solution {
    public int longestConsecutive(int[] nums) {

        var set = new HashSet<Integer>();
        for(var n: nums){
            set.add(n);
        }

        var out = 0;
        for(var n: nums){
            if(!set.contains(n-1)){
                var s=0;
                while(set.contains(n+s+1)){
                    s++;
                }
                out = Math.max(out,s+1);
            }
        }

        return out;
    }
}
