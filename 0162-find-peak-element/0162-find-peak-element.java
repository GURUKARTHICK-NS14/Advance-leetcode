class Solution {
    public int findPeakElement(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr);
        int top=0;
        int peak=arr[arr.length-1];
        for(int i=0;i<nums.length;i++){
            if(peak==nums[i]){
                top=i;
            }
        }
        return top;
    }
}