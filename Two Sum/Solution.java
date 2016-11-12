public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index1 = 0;
        int index2 = 0;
        int arraySize = 0;
        int[] arrayRes = new int[2];
        
        arraySize = nums.length;
        for(int i = 0; i < arraySize - 1; i++)
        {
            for(int j = i + 1; j < arraySize; j++)
            {
                if ((nums[i]+nums[j]) == target){
                    arrayRes[0] = i;
                    arrayRes[1] = j;
                }
            }
        }
        return arrayRes;
    }
}
