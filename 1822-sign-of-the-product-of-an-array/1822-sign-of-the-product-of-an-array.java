class Solution {
    public int arraySign(int[] nums) {
        int sign = 1;
        for(int i = 0; i< nums.length;i++){
            if(nums[i] == 0){
                return signFunc(0);
            }
            if(nums[i] < 0){
                sign = sign*signFunc(nums[i]);
            }
        }    
        return sign;
    }
    public int signFunc(int x) {
        if (x > 0) {
            return 1;
        }

        if (x < 0) {
            return -1;
        }

        return 0;
    }
}
        