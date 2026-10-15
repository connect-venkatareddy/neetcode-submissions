class Solution {
    public int[] twoSum(int[] nums, int target) {
        // brute force way
        for(int i=0; i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                var flag = nums[i] + nums[j] == target;
                if(flag){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
