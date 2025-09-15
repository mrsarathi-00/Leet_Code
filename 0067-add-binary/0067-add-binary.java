class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int cry=0;
        while(i>=0 ||j>=0||cry>0){
            int sum=cry;
            if(i>=0){
                sum+=a.charAt(i--)-'0';
            }
            if(j>=0){
                sum+=b.charAt(j--)-'0';
            }
            sb.append(sum%2);
            cry=sum/2;
        }
        return sb.reverse().toString();
    }
}