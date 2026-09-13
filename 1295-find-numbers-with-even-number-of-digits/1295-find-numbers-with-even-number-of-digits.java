class Solution {
    public int findNumbers(int[] nums) {
        int total=0;
        for(int b:nums){
            int c=0;
            while(b>0){
                c=c+1;
                b=b/10;
            }
            if(c%2==0){
                total=total+1;
            }
        }
        return total;
    }
}