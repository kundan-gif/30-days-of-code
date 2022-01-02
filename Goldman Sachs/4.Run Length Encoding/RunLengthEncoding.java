public class RunLengthEncoding {

    //Problem link -> https://practice.geeksforgeeks.org/problems/run-length-encoding/1/

   public static String encode(String str) {

        char[] arr = str.toCharArray();
        String ans = "";
        ans += arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                ans += String.valueOf(count);
                ans += arr[i];
                count = 1;
            }

        }
        ans += String.valueOf(count);
        return ans;
    }
}
