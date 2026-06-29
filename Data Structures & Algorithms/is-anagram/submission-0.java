class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
    
        int m=s.length();

        int n=t.length();
        if(m!=n){
            return false;
        }
        for (char ch : s.toCharArray()) {
            hm1.put(ch, hm1.getOrDefault(ch, 0) + 1);
}
for(char ch: t.toCharArray()){
    hm2.put(ch, hm2.getOrDefault(ch,0)+1);

}


      
        


return hm1.equals(hm2);
    }
}
