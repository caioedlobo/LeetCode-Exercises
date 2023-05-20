class Solution {
    //O(n)
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> numsSet = new HashSet<>();
            for(int i = 0; i < nums.length; i++){
                if(numsSet.contains(nums[i])){
                    return true;
                }
                numsSet.add(nums[i]);

            }
            return false;
        }
    }

    //O(N^2)
    /*public boolean containsDuplicate(int[] nums) {
        for(int index = 0; index < nums.length; index++){
            for(int j = index + 1; j < nums.length; j++){
                if(nums[index] == nums[j]){
                    System.out.println((nums[index]));
                    return true;
                }
                j++;
            }
        }
        return false;
    }*/

}