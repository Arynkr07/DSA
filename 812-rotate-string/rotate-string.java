class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String d = s + s;
        for(int i=0;i<=d.length()-goal.length();i++){
             if (d.substring(i, i + goal.length()).equals(goal)) {
                return true;
            }
        }
        return false;
    }
}