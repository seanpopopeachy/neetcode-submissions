class Solution {
    public int maxArea(int[] heights) {
        int p1 = 0;
        int p2 = heights.length - 1;
        int width = heights.length - 1;
        int highest = width * Math.min(heights[p1], heights[p2]);

        while(p1 < p2) {
            if(heights[p1] <= heights[p2]) {
                p1++;
                width--;
            } else {
                p2--;
                width--;
            }

            if(width * Math.min(heights[p1], heights[p2]) > highest) {
                highest = width * Math.min(heights[p1], heights[p2]);
            }
        }

        return highest;
    }
}
