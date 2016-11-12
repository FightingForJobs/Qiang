
public class Solution {
    public void moveZeroes(int[] nums) {
        int arrayLength =  nums.length;
        int zeroPos = 0;
        int nonZeroPos = 0;
        
        for(int i = 0; i<arrayLength; i++){
            if(nums[i] == 0){
                zeroPos = i;
                
                while(nums[nonZeroPos] == 0 || nonZeroPos < zeroPos){
                    
                    if(nonZeroPos >= arrayLength-1){
                    break;
                    }else{
                        nonZeroPos += 1;
                    }
                }
                
                System.out.println("" + zeroPos+" "+nonZeroPos);
                nums[zeroPos] = nums[nonZeroPos];
                nums[nonZeroPos] = 0;
            }else{
                continue;
            }
        } 
    }
}
