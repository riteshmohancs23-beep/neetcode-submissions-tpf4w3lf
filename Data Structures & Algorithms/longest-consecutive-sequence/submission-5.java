class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int ans=0;
        for(int x:nums){
            int len=0;
            if(!set.contains(x-1)){//---> this is the starting point of the sequence
                int curr=x;
                while(set.contains(curr)){
                    len++;
                    curr++;
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
