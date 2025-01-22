class Solution {
    public boolean canJump(int[] nums) {
        int maxIndexReached=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>maxIndexReached) return false;

            maxIndexReached=Math.max(maxIndexReached,i+nums[i]);

            if(maxIndexReached>=n-1){
                return true;
            }

        }

        return false;

        
    }
}
