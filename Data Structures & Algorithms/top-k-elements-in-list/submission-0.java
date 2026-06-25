class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] frequency = new List[nums.length + 1];

        for(int i = 0; i < nums.length + 1; i++) {
            frequency[i] = new ArrayList<>();
        }

        for(int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        for(int n : count.keySet()) {
            int f = count.get(n);
            frequency[f].add(n);
        }

        int[] result = new int[k];
        int index = 0;

        for(int i = nums.length; i > 0 && index < k; i--) {
            for(int n : frequency[i]) {
                result[index++] = n;

                if(index == k) {
                    return result;
                }
            }
        }

        return result;
    }
}
