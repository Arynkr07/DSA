class Solution {
    public int diagonalSum(int[][] mat) {
        int m = mat.length;
        int sum =0;
        
        for(int i=0;i<m ;i++){
            sum+= mat[i][i];
            if(i != m-i-1){
                sum += mat[i][m-i-1];
            }
        }
        
        return sum;
    }
}