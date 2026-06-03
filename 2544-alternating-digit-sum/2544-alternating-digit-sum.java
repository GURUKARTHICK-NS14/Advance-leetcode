class Solution {
    public int alternateDigitSum(int n) {
        String s=Integer.toString(n);
        char ch[]=s.toCharArray();
        int arr[]=new int[ch.length];
        for(int i=0;i<ch.length;i++){
            arr[i]=ch[i]-'0';
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                sum+=arr[i];
            }else{
                sum-=arr[i];
            }
        }
        return sum;
    }
}