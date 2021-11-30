class Solution {
    public static void merge(int[] A, int m, int[] B, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int cur = m + n -1;
        while (p1 >= 0 && p2 >=0){
            A[cur --] = A[p1] > B[p2] ? A[p1--] : B[p2--];
        }
        // while (p1 >= 0){
        //     A[cur--] = A[p1--];
        // }
        while (p2 >= 0){
            A[cur--] = B[p2--];
        }
    }
}
