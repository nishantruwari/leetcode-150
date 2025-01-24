class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int diff=0;
        int res=0;
        int ans=0;
        int n=gas.length;

        for(int i=0;i<n;i++){
            diff+=(gas[i]-cost[i]);
            res+=(gas[i]-cost[i]);

            if(res<0){
                ans=i+1;   // since it became 0 it means it cant be started from  ans pos or ith position 
                res=0;
            }
        }

        if(diff>=0) return ans; // total gas should be more than or equal to cost 
        return -1;
        
    }
}
