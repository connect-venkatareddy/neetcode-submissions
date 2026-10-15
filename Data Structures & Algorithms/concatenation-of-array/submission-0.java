class Solution {
    public int[] getConcatenation(int[] nums) {
        // Java streams way
        return IntStream
        .range(0,nums.length*2)
        .map((i)->{
            var k = i<nums.length?i:i-nums.length;
            return nums[k];
        })
        .toArray();
        
    }
/*
    // loops way
    public int[] getConcatenation(int[] nums) {
        
        var ans = new int[nums.length*2];

        for(int i=0; i<ans.length;i++){
            var k = i<nums.length ? i : i-nums.length;
            ans[i]= nums[k];
        }
        return ans;
    }
    */
}