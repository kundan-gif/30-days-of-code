public class PositionOfMthItem {

  //problem link -> https://practice.geeksforgeeks.org/problems/find-the-position-of-m-th-item1723/1

    static int findPosition(int n, int m, int k) {
        if (m <= n - k + 1)
            return m + k - 1;
        m = m - (n - k + 1);
        return (m % n == 0) ? n : (m % n);
    }
}
