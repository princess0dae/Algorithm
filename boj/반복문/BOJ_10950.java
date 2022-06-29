package boj.반복문;

import java.util.Scanner;

public class BOJ_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] c = new int[t];

        for(int i = 0; i <= t - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            c[i] = a + b;
        }
        for(int i = 0; i <= t - 1; i++){
            System.out.println(c[i]);
        }
    }
}

