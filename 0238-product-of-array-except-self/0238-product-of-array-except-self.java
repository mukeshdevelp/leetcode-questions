class Solution {
    public int[] productExceptSelf(int[] nums) {
        // create an arrray to store result
        int[] ans = new int[nums.length];
        ans[0] = 1;
        // traverse the given array
        for(int i = 1; i < nums.length; i++){
            // prefix multiplication
            ans[i] = nums[i-1] * ans[i-1];
        } 
        // setting last value as 1
        int  postfix = 1;
        
        // loop for postfix array
        for(int i = nums.length-1; i >= 0; i--){

            // postfix multiplication
            ans[i] *= postfix;
            postfix *= nums[i];
        }

        return ans;
    }
}