import java.util.*;
public class Solution{
    public static int trap(int []arr){
        if(arr==null||arr.length<3){
            return 0;
        }
        int leftmax=arr[0];
        Stack<Integer>s=new Stack<>();
        s.push(arr[arr.length-1]);
        for(int i=arr.length-2;i>=1;i--){
            s.push(Math.max(arr[i],s.peek()));
        }
        int water=0;
        for(int i=1;i<arr.length-1;i++){
            int minheight=Math.min(leftmax,s.peek());
            water+=Math.max(0,minheight-arr[i]);
            s.pop();
            leftmax=Math.max(leftmax,arr[i]);
        }
        return water;
    }
    public static void main(String[]args){
        int arr[]={4,2,0,3,2};
        System.out.print(trap(arr));
    }
}