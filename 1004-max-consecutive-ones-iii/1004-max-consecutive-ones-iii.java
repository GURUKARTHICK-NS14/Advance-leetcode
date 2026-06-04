import java.util.*;
public class Solution {
    public static int longestOnes(int[] arr,int k){
        int mlen=0;
        int zero=0;
        int ws=0;
        for(int we=0;we<arr.length;we++){
            if(arr[we]==0){
                zero++;
            }
            while(zero>k){
                if(arr[ws]==0){
                    zero--;
                }
                ws++;
            }
            mlen=Math.max(mlen,we-ws+1);
        }
        return mlen;
    }
    public static void main(String[] args){
        int arr[] = {1,1,0,1,1,1,0};
        int k = 1;
        System.out.println(longestOnes(arr,k));
    }
}