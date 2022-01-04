import java.util.Stack;

public class NumberFollowingAPattern {
    //Problem link -> https://practice.geeksforgeeks.org/problems/number-following-a-pattern3126/1

    static String printMinNumberForPattern(String str) {
        String ans = "";
        Stack<Integer> st = new Stack<>();

        int num = 1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'D') {
                st.push(num);
                num++;
            } else {
                st.push(num);
                num++;

                while (st.size() > 0) {
                    ans += st.pop();
                }
            }
        }

        st.push(num);
        while (st.size() > 0) {
            ans += st.pop();
        }
        return ans;
    }
}
