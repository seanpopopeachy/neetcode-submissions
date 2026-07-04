class Solution {
    public boolean isPalindrome(String s) {
        // StringBuilder newInput = new StringBuilder();

        // for(char c : s.toCharArray()) {
        //     if(Character.isLetterOrDigit(c)) {
        //         newInput.append(Character.toLowerCase(c));
        //     }
        // }

        // return newInput.toString().equals(newInput.reverse().toString());

        int l = 0, r = s.length() - 1;
        
        while(l < r) {
            while(l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            
            while(l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }

            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)) ) {
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}
