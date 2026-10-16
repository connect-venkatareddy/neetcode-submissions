class Solution {

    public int majorityElement(int[] nums) {

        // algo way
        var count=0;
        var result=nums[0];
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]==result){
                count++;
            }else{
                if(count==0){
                    result = nums[i];
                    count++;
                }
                count--;
            }
        }
        return result;

    }
    /*
    public int majorityElement(int[] nums) {
        
        var map = new HashMap<Integer,Integer>();

        for(var n: nums){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }else{
                map.put(n,1);
            }
        }

        for(var e : map.entrySet()){
            if(e.getValue()>(nums.length/2)){
                return e.getKey();
            }
        }

        return 0;
    }*/
}