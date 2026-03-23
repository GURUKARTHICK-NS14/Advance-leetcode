class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0,s=0,f=0;
        if(word.charAt(0)>='A'&& word.charAt(0)<='Z'){
                f++;
        }
        System.out.print(f);
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch>='A'&&ch<='Z'){
                count++;
            }else if(ch>='a'&&ch<='z'){
                s++;
            }
        }
        if(count==word.length()||s==word.length()){
            return true;
        }
        if(f==1&&s==word.length()-1){
            return true;
        }
        return false;
    }
}