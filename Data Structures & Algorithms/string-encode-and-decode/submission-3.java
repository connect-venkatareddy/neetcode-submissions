class Solution {

    public String encode(List<String> strs) {

        var out = "";
        for(var s : strs){
            out = out+"@"+s.length()+"@"+s;
        }
        return out;
    }

    public List<String> decode(String str) {

        var list = new ArrayList<String>();
        if(str.length() == 0){
            return list;
        }
        var len = str.length();
        var lastSymbolIndex=0;

        while(true){

        var left=str.indexOf("@",lastSymbolIndex);
        var right=str.indexOf("@",left+1);

        var strLength=str.substring(left+1,right);
        var msgLastIndex = right+1+Integer.parseInt(strLength);
        var msgString = str.substring(right+1,msgLastIndex);
        
        list.add(msgString);
        lastSymbolIndex = msgLastIndex;
        
            if(msgLastIndex>=len){
             break;
            }

        }

        return list;
    }
}
