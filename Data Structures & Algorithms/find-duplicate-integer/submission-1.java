class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(fast != slow);

        fast = 0;

        do{
            slow = nums[slow];
            fast = nums[fast];
        }while(fast != slow);
        
        return fast;

        /* 
        Set<Integer> seen = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            if(seen.contains(nums[i])) {
                return nums[i];
            } else {
                seen.add(nums[i]);
            }
        }

        return 0; 
        */
    }
}
