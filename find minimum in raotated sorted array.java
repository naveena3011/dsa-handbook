class Solution {
  public int findMin(ArrayList<Integer> arr) {
    Integer[] nums = arr.toArray(new Integer[0]);
    int left = 0;
    int right = nums.length - 1;
    while (left < right) {
      int mid = (left + right) / 2;
      if (nums[mid] > nums[right]) {
        // minimum is in RIGHT half
        left = mid + 1;
      } else {
        // minimum is in LEFT half (including mid)
        right = mid;
      }
    }
    return nums[left];
  }
}
