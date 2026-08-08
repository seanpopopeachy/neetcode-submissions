class Solution {
    public int trap(int[] height) {
        int total = 0;

        int l = 0;
        int r = height.length - 1;
        int lm = height[l];
        int rm = height[r];

        while(l < r) {
            if(lm < rm) {
                l++;
                lm = Math.max(lm, height[l]);
                total += (lm - height[l]);
            } else {
                r--;
                rm = Math.max(rm, height[r]);
                total += (rm - height[r]);
            }
        }

        return total;
    }
}
