class Solution {
    public int search(int[] nums, int k) {
       int left=0;
       int right=nums.length-1;
       while(left<=right){
        int mid=(left+right)/2;
        if(nums[mid]==k){
            return mid;
        }
        //if left portion is sorted
        if(nums[left]<= nums[mid]){
            if(nums[left]<=k && k<=nums[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        //right portion is sorted
        if(nums[mid]<=nums[right]){
            if(nums[mid]<=k && k<=nums[right]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
       }
       return -1;
    }
}
