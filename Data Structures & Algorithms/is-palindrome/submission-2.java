class Solution {
    public boolean isPalindrome(String s) {
        String palindrome = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        char []arr=palindrome.toCharArray();
        int left=0;
        int right=arr.length-1;

        while(left<right){
            if(arr[left]==arr[right]){
                left++;
                right--;

            }
            else{
                if(arr[left]!=arr[right]){
                    return false;
                }
            }

        }
        return true;
       
        
    }
}
