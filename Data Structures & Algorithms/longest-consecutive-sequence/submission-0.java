class Solution {
    public int longestConsecutive(int[] nums) {
        // basic solution---> sort---> O(nlogn) time to finish
        int arr[]=new int[nums.length];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        Set<Integer> set=new HashSet<>();
        for(int x:nums){
            min=Math.min(x,min);
            max=Math.max(x,max);
            set.add(x);
        }
        int ans=0;
        int len=0;
        for(int i=min;i<=max;i++){
            if(set.contains(i)){
                len++;
                ans=Math.max(ans,len);
            }
            else{
                len=0;
            }
        }
        return ans;
       
    }
}
