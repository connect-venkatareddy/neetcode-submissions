class Solution {
    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer,Integer>();

        for(int i=0; i<nums.length; i++){
            var y = target - nums[i];
            if(map.containsKey(y)){
                return new int[]{map.get(y),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }

    /*
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

    */
}
