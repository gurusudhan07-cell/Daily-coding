class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int m = 0;
        for(int i = 0 ; i < height.length ; i++){
            int a = Math.min(height[l],height[r]) * (r - l);
            m = Math.max(m,a);
            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }
        return m;
    }
}