class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length(); i++){
            for(int j=i ; j<s.length();j++){
                int left =i;
                int right = j;
                while(left <right){
                    if(s.charAt(left) != s.charAt(right)){
                        break;
                    }
                    left++;
                    right--;
                }
                if(left>=right) count++;
            }
        }
        return count;
    }
}