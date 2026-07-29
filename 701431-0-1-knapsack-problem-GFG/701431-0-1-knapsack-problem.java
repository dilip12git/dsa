class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        int[] dp=new int[W+1];
         for(int i=0;i<wt.length;i++){
             for(int w=W;w>=wt[i];w--){
                 dp[w]=Math.max(dp[w],val[i]+dp[w-wt[i]]);
             }
         }
         
         return dp[W];
        
       
        
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna