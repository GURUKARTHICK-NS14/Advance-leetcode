import java.util.*;
public class Solution{
    public static int maxVowels(String s,int k){
        char ch[]=s.toCharArray();
        int count=0;
        int msum=0;
        int ws=0;
        for(int we=0;we<ch.length;we++){
            if(ch[we]=='a'||ch[we]=='e'||ch[we]=='i'||ch[we]=='o'||ch[we]=='u'){
                count++;
            }
            if(we>=k-1){
                msum=Math.max(msum,count);
                if(ch[ws]=='a'||ch[ws]=='e'||ch[ws]=='i'||ch[ws]=='o'||ch[ws]=='u'){
                    count=count-1;
                }
                ws++;
            }
        }
        return msum;
        
    }
    public static void main(String[]args){
        String s="abciiidef";
        System.out.print(maxVowels(s,4));
    }
}