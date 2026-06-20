class Solution {
    public int findKRotation(ArrayList<Integer> nums) {
    Integer[] arr=nums.toArray(new Integer[0]);
    int left=0;
    int right=arr.length-1;
    while(left<right){
        int mid=(left+right)/2;
        if(arr[right]<arr[mid]){
            left=mid+1;
        }
        else{
            right=mid;
        }
    }
    return left;
    }
}