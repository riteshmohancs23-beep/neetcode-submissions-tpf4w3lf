class Solution {
    public int maxProfit(int[] prices) {
        // idea simple 
        // buy at a samll rate and sell at a higher rate thats it 
        int prof=0;
        int curr=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]>curr){
                prof=Math.max(prof,prices[i]-curr);
            }
            curr=Math.min(prices[i],curr);
        }
        return prof;
    }
}
