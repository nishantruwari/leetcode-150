class Solution {
    public int removeDuplicates(int[] nums) {

        int n=nums.length;
        int a =Integer.MIN_VALUE;
        int count=0;

        int j=0;

        for(int i=0;i<n;i++){
            if(a==nums[i]){
                if(count==2){
                    continue;
                }else{
                    count=2;
                    nums[j]=a;
                    ++j;
                    continue;
                }
            }

            a=nums[i];
            count=1;
            nums[j]=a;
            ++j;

        }

        return j;
        
    }
}
