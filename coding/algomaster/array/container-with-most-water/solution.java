class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int ans = Integer.MIN_VALUE;
        while(start<end){
            int w = end-start;
            int h = Math.min(height[start],height[end]);
            int result = h * w;
            ans = Math.max(ans,result);
            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return ans;
    }
}