class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        Set<Character> set=new HashSet<>();
        int n=s.length();
        int len=0;
        while(j<n){
            char x=s.charAt(j);
            //shrinking of the window logic \
            while(i<j && set.contains(x)){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(x);
            len=Math.max(len,j-i+1);
            j++;
        }
        return len;
    }
}
