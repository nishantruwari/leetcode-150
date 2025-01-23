class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n=nums.length;
        int [] ans=new int[n];
        int prod=1;
        int flag=0;
        int count=0;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                 flag=1;
                 ++count;
                 continue;

            }
            prod*=nums[i];
        }

        if(flag==0){
            for(int i=0;i<n;i++){
                ans[i]=prod/nums[i];
            
            }
                
        }else if(flag==1 && count==1){
            for(int i=0;i<n;i++){
                if(nums[i]==0)
                ans[i]=prod;
            
            }

        }else{
            for(int i=0;i<n;i++){
                ans[i]=0;
            
            }
        }

        return ans;
        


        
    }
}
