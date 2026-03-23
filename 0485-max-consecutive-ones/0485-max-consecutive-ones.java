class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int min = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                min += 1;
            }
            else{
                if(max < min){
                    max = min;
                }
                min = 0;
            }
            if(nums[nums.length-1] == 1){
                if(max < min){
                    max = min;
                }
            }
        }
        return max;
    }
}