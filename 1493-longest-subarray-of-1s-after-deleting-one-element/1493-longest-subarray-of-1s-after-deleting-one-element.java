class Solution {
    public int longestSubarray(int[] arr) {
        int mlen=0;
        int zero=0;
        int ws=0;
        for(int we=0;we<arr.length;we++){
            if(arr[we]==0){
                zero++;
            }
            while(zero>1){
                if(arr[ws]==0){
                    zero--;
                }
                ws++;
            }
            mlen=Math.max(mlen,we-ws+1);
        }
        return mlen-1;
    }
}