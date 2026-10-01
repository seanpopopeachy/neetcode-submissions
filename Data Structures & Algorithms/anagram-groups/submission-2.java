class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            

            if (!anagrams.containsKey(key)) {
                anagrams.put(key, new ArrayList<>());
            }

            anagrams.get(key).add(s);
        }

        return new ArrayList<>(anagrams.values());
    }
}

/*  - Create HashMap<String, List<String>>
    - For each string s in strs:
    - key = sorted version of s
    - if key not in map, put key -> new empty list
    - add s to map[key]
    - Return all the map's values as a list
*/