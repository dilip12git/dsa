class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int ans=0;

        int cost =1;

        while(n>0){
            int take=Math.min(8,n);
            ans+=take*cost;
            n-=take;
            cost++;
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna