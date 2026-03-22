class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum=numBottles;
        while(numBottles>=numExchange){
            int d=numBottles/numExchange;
            int remaining=numBottles%numExchange;
            sum+=d;
            numBottles=d+remaining;
        }
        return sum;
    }
}