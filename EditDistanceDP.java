class EditDistanceDP{
    public static int minDistance(string word1,string word2){
        int m= word1.length();
        int n= word2.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<=n;i++){
            dp[0][i]=i;
            for(int j=0;j<=n;j++){
                dp[0][j]=j;
                for(int i=1;i<=n;i++){
                    for(int j=1;j<=n;j++){
                        if(word1.charAt(i-1))
                    }
                }
            }
        }
    }
}