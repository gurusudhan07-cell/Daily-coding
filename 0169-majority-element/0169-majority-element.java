class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}