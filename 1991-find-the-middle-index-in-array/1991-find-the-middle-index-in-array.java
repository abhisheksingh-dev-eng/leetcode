
class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int totalSum = 0;

        // Calculate total sum
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - nums[i];

            // Check before updating leftSum
            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}
