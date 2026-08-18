class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int []prefixproduct=new int [n];
        prefixproduct[0]=nums[0];

        for(int i=1; i<n; i++){
            prefixproduct[i]=prefixproduct[i-1]*nums[i];


        }
        int suffix=1;
        for(int i=prefixproduct.length-1; i>0; i--){

            int currentprefix=prefixproduct[i-1];

            prefixproduct[i]=currentprefix * suffix;
            suffix=suffix*nums[i];





       
        }
        prefixproduct[0]=suffix;
       
        return prefixproduct;

        
    }
}