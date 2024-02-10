public class regularexpressionmatch {
    public static void main(String[] args) {
        String s = "aab";
        String p = "c*a*b";
        System.out.println(isMatch(s,p));
    }

    public static boolean isMatch(String s, String p){
        //optmize the solution
        int m = s.length();
        int n = p.length();
        boolean dp[][] = new boolean[m+1][n+1];
        dp[0][0]=true;
        for(int i=1;i<=n;i++){
            if(p.charAt(i-1)=='*'){
                dp[0][i]=dp[0][i-2];
            }
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(p.charAt(j-1)=='.' || p.charAt(j-1)==s.charAt(i-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else if(p.charAt(j-1)=='*'){
                    dp[i][j]=dp[i][j-2];
                    if(p.charAt(j-2)=='.' || p.charAt(j-2)==s.charAt(i-1)){
                        dp[i][j]=dp[i][j] || dp[i-1][j];
                    }
                }
                else{
                    dp[i][j]=false;
                }
            }
        }
        return dp[m][n];
    }
}
