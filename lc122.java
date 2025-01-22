class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
        int profit=0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                profit+=arr[i]-arr[i-1];
            }
        }
        return profit;
        
    }
}
