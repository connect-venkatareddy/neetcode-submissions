class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0 || nums.length==1){
            return nums.length;
        }
        
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        var out = 1;
        var maxOut =1;
        var prev = nums[0];

        for(var i=1; i<nums.length;i++){
            if(nums[i]==prev){
                continue;
            }
            if(nums[i]==(prev+1)){
                out++;
                maxOut = Math.max(maxOut,out);
            }else{
                //maxOut = Math.max(maxOut,out);
                out = 1;
            }
            prev=nums[i];
        }

        return maxOut;
    }
}
