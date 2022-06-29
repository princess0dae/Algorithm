package boj.일차원배열;

import java.util.Scanner;

public class BOJ_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = new int[n];
        int max = 0, min = 0;

        for(int i = 0; i <= n - 1; i++){
            int a = sc.nextInt();
            c[i] = a;
        }
        min = c[0];
        max = c[0];
        for(int i = 0; i <= n - 1; i++){
            if(min > c[i]){
                min = c[i];
            }
            else if(max < c[i]){
                max = c[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
