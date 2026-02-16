class Solution {
    public int reverseBits(int n) {
        int res =0;
        for(int i=1; i<=32; i++){
            res <<= 1; // left sift operater use for add at end remove one bit
            res |= (n&1); // n& 1 use for find last bit
            n>>=1; // right shift operater use for add zeo at first remove one bit
        }
        return res; // it will store my revrese bit
    }
}