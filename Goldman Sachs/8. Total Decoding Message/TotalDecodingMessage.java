public class TotalDecodingMessage {
    //problem link -> https://practice.geeksforgeeks.org/problems/total-decoding-messages1235/1/
    public int CountWays(String str) {
        if (str.charAt(0) == '0') return 0;
        int[] dp = new int[str.length()];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            if (str.charAt(i - 1) == '0') {
                if (str.charAt(i) != '0') {
                    dp[i] = dp[i - 1] % 1000000007;
                }
            } else {
                if (str.charAt(i) != '0') {
                    dp[i] = dp[i - 1] % 1000000007;
                }

                if (Integer.parseInt(str.substring(i - 1, i + 1)) <= 26) {
                    dp[i] += i == 1 ? 1 : dp[i - 2] % 1000000007;
                }
            }
        }

        return dp[str.length() - 1] % 1000000007;
    }
}
