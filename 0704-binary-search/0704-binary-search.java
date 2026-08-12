class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int mid;
        int end = nums.length -1;

        while(start <= end){
            mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                // all numbers in the left half are smaller than the target
                start = mid +1;
            }
            if(nums[mid] > target){
                // all values in the right half are larger than the target
                end = mid - 1;

            }

        } 
        return -1;
    }
}