class Solution {
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
    }
}