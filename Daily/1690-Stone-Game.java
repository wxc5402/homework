class Solution {
    public int stoneGameVII(int[] stones) {
        int n=stones.length;
        int[][] dp=new int[n][n];
        int[][] cache=new int[n][n];
        for(int i=2;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                if(i==2){
                     dp[j][j+i-1]=Math.max(stones[j],stones[j+i-1]);
                    cache[j][j+i-1]=stones[j]+stones[j+i-1];
                }
                else{
                    dp[j][j+i-1]=Math.max(cache[j][j+i-2]-dp[j][j+i-2],cache[j+1][j+i-1]-dp[j+1][j+i-1]);
                    cache[j][j+i-1]=stones[j]+cache[j+1][j+i-1];
                }
            }
        }
        return dp[0][n-1];
    }
}
