class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int ans=0;
        for(int x:set){// iterate over the set so that we donot iterate through the duplicates that are present there
            int len=1;
            if(!set.contains(x-1)){//---> this is the starting point of the sequence
                int curr=x;
                while(set.contains(curr+1)){
                    len++;
                    curr++;
                }
            }
            ans=Math.max(ans,len);
        }
        return ans;
    }
}
