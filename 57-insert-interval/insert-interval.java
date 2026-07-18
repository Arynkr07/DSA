class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> arr = new ArrayList<>();
        for(int i=0  ;i<intervals.length ; i++){
            if(intervals[i][1] < newInterval[0]){
                arr.add(intervals[i]);
            }
            else if(intervals[i][0] > newInterval[1] ){
                arr.add(newInterval);
                newInterval = intervals[i]; 
            }
            else{
                newInterval[0] = Math.min(newInterval[0] , intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1] , intervals[i][1]);
            }
            
        }
        arr.add(newInterval);
        return arr.toArray(new int[arr.size()][]);
    }
}