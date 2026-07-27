class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int res=arr[0];
        int maxEnding=arr[0];
        
        for(int i=1;i<arr.length;i++){
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            
            res=Math.max(res, maxEnding);
           
            
        }
        return res;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna