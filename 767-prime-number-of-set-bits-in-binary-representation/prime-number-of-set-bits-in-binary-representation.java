class Solution {

    private boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i*i<=n; i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        // Prime num= 2, 3, 5, 7, 11, 13, 17 ....

        int count=0;
        for(int i=left; i<=right; i++){
            int bits = Integer.bitCount(i);
            if(isPrime(bits)){
                count++;
            }
            
        }
        return count;
    }
}