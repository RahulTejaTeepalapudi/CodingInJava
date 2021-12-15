package Arrays.Arrays_I;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read size of the array
        int n = sc.nextInt();
        int[] a = new int[n];
        // Read array
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        // Read key to search
        int key = sc.nextInt();
        sc.close();
        int ans = Search(a, key);
        System.out.println(ans);
    }

    private static int Search(int[] a, int k) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k)
                return i;
        }
        return -1;
    }
}
