class Solution {

    public boolean isAnagram(String s, String t) {
        /// HashMap way
      
      if(s.length()!=t.length()){
        return false;
      }

      var mapS = new HashMap<Character,Integer>();
       var mapT = new HashMap<Character,Integer>();

      for(int i=0; i<s.length();i++){
        addCharToMap(s.charAt(i),mapS);
        addCharToMap(t.charAt(i),mapT);
      }

      // check map equality

      for(var key: mapS.keySet()){
        var flag = mapS.get(key).equals(mapT.get(key));
        if(!flag){
            return false;
        }
      }
      return true;
    }

    public void addCharToMap(char c, Map<Character,Integer> map){

        if(map.containsKey(c)){
            map.put(c,map.get(c)+1);
        }else{
            map.put(c,1);
        }

    }
    /*
    public boolean isAnagram(String s, String t) {
        /// String reverse way
      return sortString(s).equals(sortString(t));
    }*/

    public String sortString(String s){
        var array = s.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
}
