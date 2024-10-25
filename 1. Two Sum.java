import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // Store number and index

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i]; // Find number needed to reach target

            if (map.containsKey(needed)) { // Check if needed number is in map
                return new int[]{map.get(needed), i}; // Return indices if found
            }

            map.put(nums[i], i); // Add current number and index to map
        }

        return new int[0]; // Return empty if no solution
    }
}
