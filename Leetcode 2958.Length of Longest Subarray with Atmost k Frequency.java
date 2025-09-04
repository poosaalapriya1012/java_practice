class Solution {
    public boolean check(int[] nums) {
        int count=0;
        if(nums.length<=1){
            return true;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                count++;
            }
        }
       
        return count<=1;
    }
}