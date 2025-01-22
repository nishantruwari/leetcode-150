




class Solution {
    public void rotate(int[] nums, int k) {
       if(k!=0 || nums.length>1){
        int n=nums.length;
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }

        for(int i=0;i<n;i++){
            nums[(i+k)%n]=arr[i];
        }
       }

    }
}

