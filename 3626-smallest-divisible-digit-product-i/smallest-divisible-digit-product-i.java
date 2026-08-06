class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            if(helper(n) % t==0){
                return n;
            }
            else{
                n++;
            }
        }
    }
    private int helper(int n){
        int p = 1;
        while(n>0){
            int temp = n%10;
            p *= temp;
            if(p == 0) return 0;
            n = n/10;
        }
    return p;
    }
}