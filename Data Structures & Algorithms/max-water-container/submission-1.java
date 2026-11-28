class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length, l=0,r=n-1,area=0;
        while(l<=r){
            area = Math.max(area,(Math.min(heights[l],heights[r])*(r-l)));
            if(heights[l]<heights[r]) l++;
            else r--;
        }

        return area;
    }
}
