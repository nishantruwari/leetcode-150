class Solution {
    public int removeDuplicates(int[] nums) {
        int a =-111;
        int j=0;
        int n=nums.length;
         
        for(int i=0;i<n;i++){
            if(a==nums[i]){
                continue;
            }
            a=nums[i];
            nums[j]=a;
            ++j;
        }

        return j;
        
    }
}
