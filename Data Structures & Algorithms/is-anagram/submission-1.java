class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> schars = new HashMap<>();
        HashMap<Character, Integer> tchars = new HashMap<>();

        for(char chars : s.toCharArray()) {
            schars.put(chars, schars.getOrDefault(chars, 0) + 1);
        }

        for(char chars : t.toCharArray()) {
            tchars.put(chars, tchars.getOrDefault(chars, 0) + 1);
        }

        if(schars.equals(tchars)) {
            return true;
        }

        return false;
    }
}
