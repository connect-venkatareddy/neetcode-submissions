class Solution {
    public int removeElement(int[] nums, int val) {
        
        var f=0; // fill pointer
        var c=0; // current pointer

        while(c<nums.length){
            if(nums[c]!=val){
                nums[f] = nums[c];
                f++;
            }
            c++;
        }
        return f;
    }
}