class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashSet<Integer> h = new HashSet<>();
       
        while(n != 1 && !h.contains(n)){
            h.add(n);
            int sum =0;
            while(n>0){
                int temp = n%10;
                arr.add(temp);
                n = n/10;
            }
            for(int i:arr){
                sum += i*i;
            }
            n = sum;
            arr.clear();
        }
        if(n == 1) return true;
        else return false;
    }
}