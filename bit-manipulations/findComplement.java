/*
       The first idea i got from my previous study is to use the EXOR (^) operator.
       Then i had thinking how to know the count of bits of a number. 
       If it was for a 32 bit integer, I would just run a for loop upto 32.
       But that was not the situation.
       So I thought of counting the bits through a while loop and later use a for loop to do the op.
       Inside the for loop, I used the technique I learned from solving the "Reversing Bits" prob.
       So yeah, I basically did the extraction of bit -> flip it-> store it in result.
*/ 


class Solution {
    public int findComplement(int num) {
        if(num==1)return 0;
        int dup=num;
        int count=0;
        while(dup>0){
            count++;
            dup>>=1;
        }
        int res=0;
        
        for(int i=0;i<count;i++){
            int bit=((num>>i)&1)^1;
            res=res|(bit<<i);
        }
        return res;
    }
}