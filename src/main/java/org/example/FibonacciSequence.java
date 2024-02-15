package org.example;


//Time complexity O(n)
//Space complexity O(1)
public  class FibonacciSequence {
    public int iterativeFib(int n){
        if(n < 0){
            throw new IllegalArgumentException("Invalid arguments");
        }
        if (n <= 1) {
            return n;
        }
        int prev1 = 0;
        int prev2 = 1;
        int current = 0;
        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
        return current;
    }

    //Time complexity O(n)
    //Space complexity O(1)
    public int recursiveFib(int n){
        if(n < 0){
            throw new IllegalArgumentException("Invalid arguments");
        }
        if (n <= 1) {
            return n;
        }
        return recursiveFib(n - 1) + recursiveFib(n - 2);
    }
    //Time complexity O(n)
    //Space complexity O(n)
    public int dynamicFib(int n){
        if(n < 0){
            throw new IllegalArgumentException("Invalid arguments");
        }
        if (n <= 1) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
