class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()){
            return false;
        }
        Map<Character,Integer> map1=new HashMap<>();
        for(char x:s1.toCharArray()){
            map1.put(x,map1.getOrDefault(x,0)+1);
        }
        Map<Character,Integer> map2=new HashMap<>();
        String str=s2.substring(0,s1.length());
        for(char x:str.toCharArray()){
            map2.put(x,map2.getOrDefault(x,0)+1);
        }
        if(map1.equals(map2)){
            return true;
        }
        int i=0;
        int j=s1.length()-1;
        while(j+1<s2.length()){
            map2.put(s2.charAt(i),map2.get(s2.charAt(i))-1);
            if(map2.get(s2.charAt(i))==0){
                map2.remove(s2.charAt(i));
            }
            i++;
            j++;
            map2.put(s2.charAt(j),map2.getOrDefault(s2.charAt(j),0)+1);
            if(map1.equals(map2)){
                return true;
            }
        }
        return false;
    }
}
