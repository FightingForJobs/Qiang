
public class Solution {
    public int getSum(int a, int b) {
        int res = a ^ b;
        int carry = (a & b) << 1;
        if(carry != 0){
            res = getSum(carry,res);
        }
        return res;
    }
}