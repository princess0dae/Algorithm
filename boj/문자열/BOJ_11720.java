package boj.문자열;

import java.util.Scanner;

public class BOJ_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String c = sc.next();
        int sum = 0;

        for(int i = 0; i <= n - 1; i++){
             sum = sum + c.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
