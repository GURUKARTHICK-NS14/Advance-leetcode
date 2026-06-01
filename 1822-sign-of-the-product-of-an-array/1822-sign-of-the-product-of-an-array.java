class Solution {
    public int arraySign(int[] nums) {
        double prod=1;
        for(int i=0;i<nums.length;i++){
            prod=prod*nums[i];
        }
        if(prod>0){
            return 1;
        }else if(prod<0){
            return -1;
        }
        return 0;
    }
}