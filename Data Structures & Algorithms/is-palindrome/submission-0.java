class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newInput = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                newInput.append(Character.toLowerCase(c));
            }
        }

        return newInput.toString().equals(newInput.reverse().toString());
    }
}
