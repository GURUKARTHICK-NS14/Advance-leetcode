class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String a=s.replaceAll(" +"," ");
        String[]arr=a.split(" ");
        String arr1[]=new String[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            arr1[i]=arr[arr.length-1-i];
        }
        return String.join(" ",arr1);
    }
}