class Solution {
    public int maxFreqSum(String s) {
        int mxvowel=0;
        int mxconsonant=0;
        int arr[]=new int[26];
        for(char sr:s.toCharArray()){
           arr[sr-'a']++;
        }
        for(int i=0;i<26;i++){
            char a=(char)(i+'a');
            if("aeiou".indexOf(a)!=-1){
                mxvowel=Math.max(mxvowel,arr[i]);
            }
            else{
                mxconsonant=Math.max(mxconsonant,arr[i]);
            }
        }
        return mxconsonant+mxvowel;
    }
}