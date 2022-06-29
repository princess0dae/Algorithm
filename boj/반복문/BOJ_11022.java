package boj.반복문;

import java.util.Scanner;

public class BOJ_11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i <= t - 1; i ++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case #" + (i + 1) + ":" + " " + a + " + " + b + " = " + (a + b));
        }
    }
}
