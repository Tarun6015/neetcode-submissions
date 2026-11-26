class Solution {
    public void sortColors(int[] nums) {
        int l=0,p=0,r=nums.length-1;

        while(p<=r){
            if(nums[p]==1)p++;
            else if(nums[p]==0){
                int temp = nums[p];
                nums[p] = nums[l];
                nums[l] = temp;
                p++;
                l++;
            }
            else if(nums[p]==2){
                int temp = nums[p];
                nums[p] = nums[r];
                nums[r] = temp;
                r--;
            }
        }
    }
}