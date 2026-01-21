class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;

        Stack<Character> bracketsStack = new Stack();

        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            if(c.equals('(')) {
                bracketsStack.push(')');
            }else if(c.equals('[')){
                bracketsStack.push(']');
            }else if (c.equals('{')){
                bracketsStack.push('}');
            }else if(bracketsStack.isEmpty() || bracketsStack.pop()!= s.charAt(i)){
                return false;
            }
        }
        return bracketsStack.isEmpty();
    }
}