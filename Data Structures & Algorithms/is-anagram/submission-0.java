class Solution {
    public boolean isAnagram(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        boolean op=false;
        if(n1!=n2){
            return op;
        }
        char arr1[]=s.toCharArray();
        char arr2[]=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String sortedstr1=new String(arr1);
        String sortedstr2=new String(arr2);
        for(int i=0;i<n1;i++){
                char c1=sortedstr1.charAt(i);
                char c2=sortedstr2.charAt(i);
                if(c1!=c2){
                    op=false;
                    return op;
                }
        }
                
                    op=true;
                    return op;
            }
        }

   