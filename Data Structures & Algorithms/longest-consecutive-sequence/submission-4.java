class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int ans=0;
        for(int x:nums){
            int len=0;
            if(set.contains(x-1)){
                while(set.contains(x)){
                    len++;
                    x--;
                }
            }
            else{
                // if no sequence is found then the lenght will be at least  1
               len=1;
            }
            ans=Math.max(ans,len);
        }
        return ans;
    }
}
