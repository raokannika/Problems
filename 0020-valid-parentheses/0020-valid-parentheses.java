class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> stack = new ArrayList<>(); 
        for(int i = 0; i < s.length() ; i++){
            if (s.charAt(i) == '{'){
                stack.add('}');
            }
            else if (s.charAt(i) == '('){
                stack.add(')');
            }
            else if (s.charAt(i) == '['){
                stack.add(']');
            }
            else{
                if( stack.isEmpty()){
                    return false;
                }
                char popped = stack.remove(stack.size() -1);
                if(s.charAt(i) != popped){
                    return false;
                }
            }

        }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}