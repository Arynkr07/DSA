class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        
        if(haystack.length() == n && haystack.equals(needle)) return 0;
        if(haystack.length() < n) return -1;
        for(int i=0;i<= haystack.length()-n ;i++){
            String sub = haystack.substring(i,i+n);
            System.out.println(sub);
            if(sub.equals(needle) ) return i;
        }
        return -1;
    }
}