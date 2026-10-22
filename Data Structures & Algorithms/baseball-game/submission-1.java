class Solution {
    public int calPoints(String[] operations) {
            var stack = new Stack<Integer>();

            for(var s : operations){
            if(s.equals("+")){
               var value= stack.peek() + stack.get(stack.size()-2);
               stack.push(value);
            }else if (s.equals("D")){
                stack.push(stack.peek()*2);
            }else if (s.equals("C")){
                stack.pop();
            }else{
                stack.push(Integer.parseInt(s));
            }
        }

        var total = 0;
        for(var n: stack){
            total = total + n;
        }

        return total;
    }
    /*
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
    */
}