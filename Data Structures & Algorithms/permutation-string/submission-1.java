

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] p = s1.toCharArray();
        Arrays.sort(p);

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            char[] temp = s2.substring(i, i + s1.length()).toCharArray();
            Arrays.sort(temp);

            if (Arrays.equals(p, temp)) {
                return true;
            }
        }
        return false;
    }
}