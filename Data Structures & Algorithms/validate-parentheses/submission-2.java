class Solution {
    public boolean isValid(String s) {
        var stack = new Stack<Character>();

        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);

            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }else if(ch == ')' && stack.size()!=0 && stack.peek().equals('(')){
                stack.pop();
            }else if(ch == '}' && stack.size()!=0 && stack.peek().equals('{')){
                stack.pop();
            }else if(ch == ']' && stack.size()!=0 && stack.peek().equals('[')){
                stack.pop();
            }else{
                return false;
            }
        }

        return stack.size()==0;
    }
}
