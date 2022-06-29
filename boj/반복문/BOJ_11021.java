package boj.반복문;

import java.util.Scanner;

public class BOJ_11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = new int[n];

        for(int i = 0; i <= n - 1; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            c[i] = a + b;
        }
        for(int i = 0; i <= n - 1; i++){
            System.out.println("Case #" + (i + 1) + ": " + c[i]);
        }
    }
}
