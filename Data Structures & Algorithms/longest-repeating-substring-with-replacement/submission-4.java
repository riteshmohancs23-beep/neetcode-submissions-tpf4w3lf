class Solution {
    public int characterReplacement(String s, int k) {
        // HashMap<Character,Integer> map=new HashMap<>();--> This was causing O(n) Space Complexity 
        // we can reduce that to a O(1) spce complexity 
        int freq[]=new int[26];
        int i=0;
        int j=0;
        int n=s.length();
        int rep=0;
        int len=0;
        int max_count=0;
        while(j<n){
            freq[s.charAt(j)-'A']++;
            max_count=Math.max(max_count,freq[s.charAt(j)-'A']);
            rep=(j-i+1)-max_count;
            //shrinking the window condition
            while(i<j && (j-i+1)-max_count>k){
                freq[s.charAt(i)-'A']--;
                i++;
            }
            len=Math.max(len,j-i+1);
            j++;
        }
        return len;
    }
}
