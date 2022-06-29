package boj.반복문;

import java.util.Scanner;

public class BOJ_2742 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n + 1;

        for(int i = 1; i <= n; i++){
            a = a - 1;
            System.out.println(a);
        }
    }
}
