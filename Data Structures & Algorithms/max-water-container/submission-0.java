class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int ans=Integer.MIN_VALUE;
        while(i<j){
            int h=Math.min(heights[i],heights[j]);
            int w=j-i;
            ans=Math.max(ans,w*h);
            if(h==heights[i]){
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    }
}
