import java.util.HashMap;
import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] arr = new int[2];
        for(int i = 0; i < nums.length; i++){
            
            
            if(map.containsKey(target - nums[i])){
                int f = map.get(target - nums[i]);
                arr[0] = f;
                arr[1] = i;
                return arr;
            }else{
                // save element as key and index as value
                map.put(nums[i], i);
            }

        }
    return arr;

    }
}