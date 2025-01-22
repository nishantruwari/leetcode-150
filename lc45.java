class Solution {
    public int jump(int[] nums) {
       // int maxFlag=0;
        int jump=0;
        int currmax=0;
        int farthest=0;
        int n=nums.length;

        for(int i=0;i<n-1;i++){

            farthest=Math.max(farthest,i+nums[i]);

            if(i==currmax){
                ++jump;
                currmax=farthest;
            }

            if(currmax>=n-1)
            {
                
                break;
            }
            
        }

        return jump;
        
    }
}
