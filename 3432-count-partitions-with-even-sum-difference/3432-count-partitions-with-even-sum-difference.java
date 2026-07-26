class Solution {
    public int countPartitions(int[] nums) {
        int totalSum = 0;
        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < nums.length-1; i++) {
            prefixSum += nums[i];
            int leftSum = prefixSum;
            int rightSum = totalSum - prefixSum;

            if (Math.abs(leftSum - rightSum) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}