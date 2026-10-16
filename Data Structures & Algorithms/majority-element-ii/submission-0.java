class Solution {
    public List<Integer> majorityElement(int[] nums) {
        var map = new HashMap<Integer,Integer>();
        for(var n: nums){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }else{
                map.put(n,1);
            }
        }
        var out = new ArrayList<Integer>();
        for(var k : map.keySet()){
            if(map.get(k)>(nums.length/3)){
                out.add(k);
            }
        }
        return out;
    }
}