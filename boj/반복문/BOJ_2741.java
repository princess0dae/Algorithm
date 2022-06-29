package boj.반복문;

import java.util.Scanner;

public class BOJ_2741 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;

        for(int i = 0; i <= n - 1; i++) {
            a = a + 1;
            System.out.println(a);
        }
    }
}
