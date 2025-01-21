class Solution {
    public int removeElement(int[] nums, int val) {

        int count=0;
        int i=0,j=0;

        int n=nums.length;
        while(i<n){
            if(nums[i]==val){
                
                ++i;
            }else{
                nums[j]=nums[i];
                ++count;
                ++i;
                ++j;
            }
        }

        return count;
        
    }
}
