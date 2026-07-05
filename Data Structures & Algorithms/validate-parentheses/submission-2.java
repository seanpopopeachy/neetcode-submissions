class Solution {
    public boolean isValid(String s) {
        // Initialise stack
        // push unless it is a closing bracket
        // if closing bracket pop stack, check if pop is same as closing bracket
        // if not same as closing bracket, return false

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if(c == ')' && top != '(' ||
                   c == ']' && top != '[' ||
                   c == '}' && top != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
