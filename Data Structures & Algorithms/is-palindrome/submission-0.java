class Solution {
    public boolean isPalindrome(String s) {
        boolean op=true;
        s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int l=0,r=s.length()-1;
        while(l<r){
            char x=s.charAt(l);
            char y=s.charAt(r);
            if(x==y){
                l++;
                r--;
            }
            else if(x!=y){
                op=false;
                break;
            }
        }
        return op;
    }
}
