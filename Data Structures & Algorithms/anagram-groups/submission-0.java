class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        var map = new HashMap<String,List<String>>();

        for(var s : strs){
            var key = sortString(s);
            if(map.containsKey(key)){
                var list = map.get(key);
                list.add(s);
            }else{
                var list = new ArrayList<String>();
                list.add(s);
                map.put(key,list);
            }
        }
var out = new ArrayList<List<String>>();
        for(var k: map.keySet()){
            out.add(map.get(k));
        }

        return out;
    }

    public String sortString(String s){
        var array = s.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
}
