class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> broken=new HashSet<>();
        for(char ch:brokenLetters.toCharArray()){
            broken.add(ch);
        }
        String[] str=text.split(" ");
        int cnt=0;
        for(String word:str){
           boolean ans=true;
           for(char x:word.toCharArray()){
            if(broken.contains(x)){
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