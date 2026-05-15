class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int n=s.length();
        int rep=0;
        int len=0;
        int max_count=0;
        while(j<n){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            max_count=Math.max(max_count,map.get(s.charAt(j)));
            rep=(j-i+1)-max_count;
            //shrinking the window condition
            while(i<j && (j-i+1)-max_count>k){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i))==0){
                    map.remove(s.charAt(i));
                }
                i++;
            }
            len=Math.max(len,j-i+1);
            j++;
        }
        return len;
    }
}
