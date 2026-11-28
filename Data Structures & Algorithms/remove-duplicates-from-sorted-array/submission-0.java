class Solution {
    public int removeDuplicates(int[] nums) {
        int l=0,r=l+1,n=nums.length;
        while(r<n){
            if(nums[l]!=nums[r]){
                l++;
                nums[l]=nums[r];
            }
            else{
                r++;
            }
        }

        return l+1;
    }
}