// Last updated: 8/22/2025, 4:45:43 PM
class Solution {
    public int longestValidParentheses(String s) {
       Stack<Integer>stack = new Stack<>();
        stack.push(-1);
        int ml= 0;
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                stack.push(i);

            }
            else{
                stack.pop();
            }if(!stack.isEmpty()){
                ml=Math.max(ml,i-stack.peek());
            }else{
                stack.push(i);
            }
        }return ml;
    }
}