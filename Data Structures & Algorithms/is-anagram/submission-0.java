class Solution {
    public boolean isAnagram(String s, String t) {

      return sortString(s).equals(sortString(t));
    }

    public String sortString(String s){
        var array = s.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
}
