class Solution {
    public void rotate(int[] nums, int k) {
        int[] st=new int[nums.length];
        int n=nums.length;
        int c=0;       
        for(int i:nums){
            st[(c+k)%n]=i;
            c++;
        }
        for (int i = 0; i < n; i++) {
            nums[i] = st[i];
        } 
    }
}
