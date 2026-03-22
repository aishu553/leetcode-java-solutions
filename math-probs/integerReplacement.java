class Solution {
    public int integerReplacement(int num) {
        long n=num;
        int op=0;
        while(n!=1){
            if(n%2==0)n=n/2;
            else{
                if(n==3 || n%4==1)n--;
                else n++;
            }
            op++;
        }
        return op;
    }
}