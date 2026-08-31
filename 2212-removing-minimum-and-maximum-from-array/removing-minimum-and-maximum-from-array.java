class Solution {
    public int minimumDeletions(int[] nums) {

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        int n = nums.length;

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {

            if (maxValue < nums[i]) {
                maxValue = nums[i];
                maxIndex = i;
            }

            if (minValue > nums[i]) {
                minValue = nums[i];
                minIndex = i;
            }
        }

        int left = Math.max(minIndex, maxIndex) + 1;

        int right = n - Math.min(minIndex, maxIndex);

        int both = Math.min(minIndex, maxIndex) + 1
                 + n - Math.max(minIndex, maxIndex);

        return Math.min(left, Math.min(right, both));
    }
}