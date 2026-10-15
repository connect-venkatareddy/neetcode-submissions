class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length==0){
            return "";
        }

        var maxLength = strs[0].length();
        var prefix = "";

        for(int i=0; i<maxLength;i++){
            var tempPrefix = strs[0].substring(0,i+1);
            for(int k=0; k<strs.length;k++){
                if(!strs[k].startsWith(tempPrefix)){
                    return prefix;
                }
            }
            prefix = tempPrefix;
        }

        return prefix;
    }
}