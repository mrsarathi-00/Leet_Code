class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr=text.split(" ");
        int cnt=0;
        for(String str:arr){
        boolean ans=true;
        for(char ch:str.toCharArray()){
            if(brokenLetters.indexOf(ch)!=-1){
                ans=false;
                break;
        }
        }
        if(ans){
            cnt++;
    }
        }
    return cnt;
        }
}