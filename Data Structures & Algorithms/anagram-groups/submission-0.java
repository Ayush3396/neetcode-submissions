class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();

        for(String word:strs){
            char []arr=word.toCharArray(); // ['e','a','t']
            Arrays.sort(arr); //['a','e','t'];
            String sorted= new String(arr); // aet
            if(!hm.containsKey(sorted)){
                hm.put(sorted, new ArrayList<>());

            }
            hm.get(sorted).add(word);


        }
        return new ArrayList<>(hm.values());

        
    }
}
