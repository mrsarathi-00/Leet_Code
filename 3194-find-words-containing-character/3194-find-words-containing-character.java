class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            boolean ans=false;
            for(int j=0;j<words[i].length();j++){
                if(words[i].charAt(j)==x){
                    res.add(i);
                    ans=true;
                    break;
                }
            }
        }
        return res;
    }
}