class Solution {
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;

        while(lo <= hi) {
            int mi = lo + ((hi - lo) / 2);
            if(nums[mi] > target) {
                hi = mi - 1;
            } else if (nums[mi] < target) {
                lo = mi + 1;
            } else {
                return mi;
            }
        }

        return -1;
    }
}
