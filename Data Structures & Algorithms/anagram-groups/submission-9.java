class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for(String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if(!anagrams.containsKey(key)) {
                anagrams.put(key, new ArrayList<>());
            }

            anagrams.get(key).add(str);
        }

        return new ArrayList<>(anagrams.values());
    }
}

// create HashMap<String, List<String>> 
// iterate for str in strs
// turn into char array
// sort char array
// make into a key
// if key is not in hashmap, put key and new arraylist
// if key is in hashmap, add
// return HashMap.values()