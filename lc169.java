class Solution {
    public int majorityElement(int[] nums) {

        //solution 1

        // HashMap<Integer,Integer> map=new HashMap<>();

        // int n=nums.length;

        // for(int i: nums){
        //     map.put(i,map.getOrDefault(i,0)+1);
        //     if(map.get(i)>n/2){
        //         return i;
        //     }
        // }
        
        
        // return -1;

        //solution 2

        // Arrays.sort(nums);
        // return nums[nums.length/2];

        //solution 3'''

        //moore algo for majority ele
        int count =0;
        int candidate =0;
        for(int i: nums){
            if(count==0){
                candidate=i;
            }

            if(i==candidate){
                ++count;
            }else {
                --count;
            }
        }

        return candidate;
    }
}
