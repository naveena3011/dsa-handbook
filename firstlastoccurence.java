class Solution {
  public int[] searchRange(int[] nums, int target) {
    int first = -1;
    int last = -1;
    int left = 0;
    int right = nums.length - 1;
    int lb = nums.length;
    int ub = nums.length;

    int ans[] = new int[2];
    // lb
    while (left <= right) {
      int mid = (right + left) / 2;
      if (nums[mid] >= target) {
        lb = mid;
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    left = 0;
    right = nums.length - 1;
    // ub
    while (left <= right) {
      int mid = (right + left) / 2;
      if (nums[mid] > target) {
        ub = mid;
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    if (lb == nums.length || nums[lb] != target) {
      first = -1;
      last = -1;
    } else {
      first = lb;
      last = ub - 1;
    }
    ans[0] = first;
    ans[1] = last;

    return ans;
  }
}
