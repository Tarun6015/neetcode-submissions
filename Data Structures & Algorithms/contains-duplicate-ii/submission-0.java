class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> hs = new HashSet<>();
        int l=0,r=0;
        while(r<nums.length){
            if((r-l)>k){
                hs.remove(nums[l]);
                l++;
            }
            if(hs.contains(nums[r])) return true;
            hs.add(nums[r]);
            r++;
        }

        return false;
    }
}