class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1=-1,num2=-1,cnt1=0,cnt2=0,n= nums.length;
        for(int num: nums){
            if(num1==num) cnt1++;
            else if(num2==num) cnt2++;
            else if(cnt1==0){
                num1=num;
                cnt1++;
            }
            else if(cnt2==0){
                num2=num;
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }

        cnt1=0;
        cnt2=0;
        for(int num: nums){
            if(num1==num) cnt1++;
            if(num2==num) cnt2++;
        }

        ArrayList<Integer> l = new ArrayList<>();
        if(cnt1>n/3) l.add(num1);
        if(cnt2>n/3) l.add(num2);

        return l;
    }
}