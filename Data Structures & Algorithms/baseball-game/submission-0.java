class Solution {
    public int calPoints(String[] operations) {
        
        var list = new ArrayList<Integer>();

        for(var s : operations){
            if(s.equals("+")){
               var value= list.get(list.size()-1) + list.get(list.size()-2);
               list.add(value);
            }else if (s.equals("D")){
                list.add(list.get(list.size()-1)*2);
            }else if (s.equals("C")){
                list.remove(list.size()-1);
            }else{
                list.add(Integer.parseInt(s));
            }
        }

        var total = 0;
        for(var n: list){
            total = total + n;
        }

        return total;
    }
}