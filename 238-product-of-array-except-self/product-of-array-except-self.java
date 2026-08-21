class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        ans[0]=1;
        for(int i=1; i<nums.length;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }
        int[] suff=new int[nums.length];
        suff[nums.length-1]=1;
        for (int i=nums.length-2;i>=0;i--){
            suff[i]=suff[i+1]*nums[i+1];
        }
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=ans[i]*suff[i];
        }
        return arr;
    }
}