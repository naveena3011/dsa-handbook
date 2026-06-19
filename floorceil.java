class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {
        int floor = -1;
        int ceil = -1;
        int left = 0, right = nums.length - 1;
        int ceilIndex = nums.length;  // important

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] >= x) {
                ceilIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // set ceil
        if (ceilIndex != nums.length) {
            ceil = nums[ceilIndex];
        }

        // set floor
        if (ceilIndex > 0) {
            floor = nums[ceilIndex - 1];
        }

        // exact match case
        if (ceil == x) {
            floor = x;
        }

        return new int[]{floor, ceil};
    }
}