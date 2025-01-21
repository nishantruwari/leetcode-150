class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

       
       
       int p=m-1;
       int q=n-1;
       int r=m+n-1;

       while(p>=0 && q>=0){
        if(nums1[p]>nums2[q]){
            nums1[r]=nums1[p];
            --r;
            --p;
        }else{
            nums1[r]=nums2[q];
            --q;
            --r;
        }
       }
       if(q>=0){
        while(r>=0){
            nums1[r]=nums2[q];
            --q;
            --r;
        }

       }
        
    }
}
