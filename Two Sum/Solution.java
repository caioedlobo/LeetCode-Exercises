class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap();

        for(int index = 0; index < nums.length; index++){
            int complement = target - nums[index];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), index};
            }
            map.put(nums[index], index);
        }
        return null;
    }
}

//if the complement is in map, means that the sum of the two numbers its equal to  the target value
// if not, it just need to add to the map until find the complement