class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Nums to a HashMap -> Find remainder (target - curr) -> O(1)
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if(numMap.containsKey(diff) && numMap.get(diff) != i) {
                return new int[]{i, numMap.get(diff)};
            }
        }

        return new int[0];
    }
}
