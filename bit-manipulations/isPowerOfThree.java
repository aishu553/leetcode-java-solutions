/*
     I saw the optimized solution for this. It uses the max pow of 3 and if the num is div by that, true.
     But, I could only solve it like this 👇🏻
*/


class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        if(n==1)return true;
        while(n%3==0){
            n=n/3;
        }
        return n==1;
    }
}