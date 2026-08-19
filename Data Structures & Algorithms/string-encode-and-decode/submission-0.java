

class Solution {

    public String encode(List<String> strs) {

        StringBuilder encoded = new StringBuilder();

        for (String code : strs) {

            int length = code.length();

            encoded.append(length);
            encoded.append('#');
            encoded.append(code);
        }

        return encoded.toString();
    }

    public List<String> decode(String encoded) {

        List<String> decoded = new ArrayList<>();

        int i = 0;

        while (i < encoded.length()) {

            int j = i;

            
            while (encoded.charAt(j) != '#') {
                j++;
            }

           
            int length = Integer.parseInt(
                encoded.substring(i, j)
            );

      
            String word = encoded.substring(
                j + 1,
                j + 1 + length
            );

            decoded.add(word);

            i = j + 1 + length;
        }

        return decoded;
    }
}